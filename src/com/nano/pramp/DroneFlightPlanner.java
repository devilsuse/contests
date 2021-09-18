package com.nano.pramp;

/**
 * You’re an engineer at a disruptive drone delivery startup and your CTO asks you to come up with an efficient algorithm that calculates the minimum amount of energy required for the company’s drone to complete its flight. You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends, and it gains 1 kWh for every mile it descends. Flying sideways neither burns nor adds any energy.

Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the minimal amount of energy the drone would need to complete its route. Assume that the drone starts its flight at the first point in route. That is, no energy was expended to place the drone at the starting point.

For simplicity, every 3D point will be represented as an integer array whose length is 3. Also, the values at indexes 0, 1, and 2 represent the x, y and z coordinates in a 3D point, respectively.

Explain your solution and analyze its time and space complexities.

Example:

input:  route = [ [0,   2, 10],
                  [3,   5,  0],
                  [9,  20,  6],
                  [10, 12, 15],
                  [10, 10,  8] ]

output: 5 # less than 5 kWh and the drone would crash before the finish
          # line. More than `5` kWh and it’d end up with excess energy
Constraints:

[time limit] 5000ms

[input] array.array.integer route

1 ≤ route.length ≤ 100
[output] integer

 * @author NanoUser
 *
 */
public class DroneFlightPlanner
{
	  public static void main(String[] args) {

	  }
	static int calcDroneMinEnergy(int[][] route) {
	    // your code goes here

	    int prevZ = route[0][2];
	    int energy=0;
	    int minEnergy=0;
	    int maxZ=route[0][2];
	    int startZ=route[0][2];
	    for(int i=1;i<route.length;i++){
	      maxZ=Math.max(maxZ, route[i][2]);
	      
	      /* My solution ==> NOt so elegant
	      
	      int[] point  = route[i];
	      energy += prevZ-point[2];
	     // if(point[2]>prevZ)
	      prevZ=point[2];
	      if(energy<0){
	        minEnergy+=-energy;
	        energy=0;
	      }
	      
	    }
	    return minEnergy;
	    */
	    }
	      return maxZ-startZ;
	  }
	}

	/*
	                [ [0,   2, 10], 0
	                  [3,   5,  0], 10
	                  [9,  20,  6], 4
	                  [10, 12, 15], 0
	                  [10, 10,  8], +7
	                  [10, 10,  20]] +7-(20-8) = -5
	*/    
