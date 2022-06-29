package com.qa.arrays;

public class ArrayRunner {
	
	public static void main(String[] args) {
	//  datatype + variable = value***- this is the structure, dont forget!***
//      index =   0...1...2...3...4	 - **arrays are indexed(structured to start from) from 0, this means that the position of each value starts from 0. This means that 5 is index(position) 0, 10 is 1 15 is 2 and so on 
       int [] numArray ={5, 10, 15, 20, 25}; // you can assign the values when you create it. *option one*
//This ^ is the syntax for arrays [] and int is the datatype, this is out way of telling java that this is going to be an integer array. This doesn't only apply to integers but also other datatypes such as strings, longs. 

       int [] otherNumArray = new int [5];// *option two* or you can create them empty, the 5 represents how many values it can have. Although this is 'empty' you MUST specify the amount/length of values it can have
//^ this is one of the limitations of regular arrays. Regular arrays are fixed length, this means that this array that has 5 values will only ever have five values. Nothing more or less.
// although this limitation is extremely strict, this can be used in situations where you know for sure there isn't going to be a change. For example the days of the week, its set and will never change. hence it'll be a days of the the week array with 7 values
// unlike regular arrays, arraylists can grow and shrink and you can put anything in it. This is a more advanced ver of arrays and has more functionality   

       for (int i = 0; i < 5; i++)
    	System.out.println(numArray[i]);
       //the square brackets after  ^the num array above, thats how it gets the actual value out of the array. when you want to reference a particular index in an array. you first say the name of the array(numArray), sqaure brackets ([]) and put a number in it from the index position 
      //sometimes you might not know what the length of the array is at first glance and to know you do this alternative: for (int i = 0; i numArray.lenghth; i++) {
     // This ^^^ is a common method when it comes to looping arrays, the length will go on until its less than. You will always use  the length of the array and not the actual single numbers normally in your condition. 
    // you can target specific arrays by choosing and running them
//	*** an array is a collection of numbers of any type regarding that it fits the datatype*** in this case int is 8 numbers and fits all
       //index=location of array ****
       // you can change the value of the array but you can never change the length of the array- IMPORTANT*** it will always be 5 lenghts but for instance you can change the value depending on the index position
// if we want to go from the beginning of an array to the end of the array without any concern ofthe index value position, there is a special loop for it.
// continue^^- it is called an Enhanced for loop- for each loop. A for loop(is the one above)
                             //for(int value : numArray)
                                         //    ^ name of array
     //^^^^^^^^^^^^^ the one above is a better way of doing the one below  
	//	(System.out.println(numArray[0]);
    //  System.out.println(numArray[1]);
	//	System.out.println(numArray[2]);
	//	System.out.println(numArray[3]);
	//	System.out.println(numArray[4]);)
		
		
	}
	
	
}


