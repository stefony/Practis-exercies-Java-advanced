# Practise-exercies-Java-advanced
Exercies-Java-advanced course @ Software University

1.	Energy Drinks

On the first line, you will receive a sequence of numbers representing milligrams of caffeinе. On the second line, you will receive another sequence of numbers representing energy drinks. It is important to know that the maximum caffeine Stamat can have for the night is 300 milligrams, and his initial is always 0.
To calculate the caffeine in the drink take the last milligrams of caffeinе and the first energy drink, and multiply them. Then, compare the result with the caffeine Stamat drank:
•	If the sum of the caffeine in the drink and the caffeine that Stamat drank doesn't exceed 300 milligrams, remove both the milligrams of caffeinе and the drink from their sequences. Also, add the caffeine to Stamat's total caffeine.
•	If Stamat is about to exceed his maximum caffeine per night, do not add the caffeine to Stamat’s total caffeine. Remove the milligrams of caffeinе and move the drink to the end of the sequence. Also, reduce the current caffeine that Stamat has taken by 30 (Note: Stamat's caffeine cannot go below 0).
Stop calculating when you are out of drinks or milligrams of caffeine.
For more clarification, see the examples below.
Input
•	In the first line, you will be given a sequence of the milligrams of caffeinе - integers separated by comma and space ", " in the range [1, 50].
•	In the second line, you will be given a sequence of energy drinks - integers separated by comma and space ", " in the range [1, 300].
Output
•	On the first line:
o	If Stamat hasn't drunk all the energy drinks, print the remaining ones separated by a comma and a space ", ": 
	"Drinks left: { remaining drinks separated by ", " }"
o	If Stamat has drunk all the energy drinks, print:
	"At least Stamat wasn't exceeding the maximum caffeine."
•	On the next line, print:
o	"Stamat is going to sleep with { current caffeine } mg caffeine."
Constraints
•	You will always have at least one element in each sequence at the beginning.



2. Rally Racing


On the first line, you will be given an integer N, which represents the size of a square matrix. On the second line you will receive the racing number of the tracked race car.
On the next N lines you will be given the rows of  the matrix (string sequences, separated by whitespace), which will be representing the race route. The tracked race car always starts with coordinates [0, 0]. Thеre will be a tunnel somewhere across the race route. If the race car runs into the tunnel , the car goes through it and exits at the other end. There will be always two positions marked with "T"(tunnel). The finish line will be marked with "F". All other positions will be marked with ".".
Keep track of the kilometers passed. Every time the race car receives a direction and moves to the next position of the race route, it covers 10 kilometers. If the car goes through the tunnel, it covers NOT 10, but 30 kilometers.
On each line, after the matrix is given, you will be receiving the directions for the race car.
•	left
•	right
•	up
•	down
The race car starts moving across the race route:
•	If you receive "End" command, before the race car manages to reach the finish line, the car is disqualified and the following output should be printed on the Console: "Racing car {racing number} DNF."
•	If the race car comes across a position marked with ".". The car passes 10 kilometers for the current move and waits for the next direction.
•	If the race car comes across a position marked with "T" this is the tunnel. The race car goes through it and moves to the other position marked with  "T" (the other end of the tunnel). The car passes 30 kilometers for the current move. The tunnel stays behind the car, so the race route is clear, and both the positions marked with "T", should be marked with ".".
•	If the car reaches the finish line - "F" position, the race is over. The tracked race car manages to finish the stage and the following output should be printed on the Console: "Racing car {racing number} finished the stage!". Don’t forget that the car has covered another 10 km with the last move.
Input
•	On the first line you will receive N - the size of the square matrix (race route).
•	On the second line you will receive the racing number of the tracked car.
•	On the next N lines, you will receive the race route (elements will be separated by a space).
•	On the following lines, you will receive directions (left, right, up, down).
•	On the last line, you will receive the command "End".
Output
•	If the racing car has reached the finish line before the "End" command is given, print on the Console: "Racing car {racing number} finished the stage!"
•	If the "End" command is given and the racing car has not reached the finish line yet, the race ends and the following message is printed on the Console: "Racing car {racing number} DNF."
•	On the second line, print the distance that the tracked race car has covered: "Distance covered {kilometers passed} km." 
•	At the end, mark the last known position of the race car with "C" and print the final state of the matrix (race route). If the race car hasn't gone through the tunnel, the tunnel exits should be visualized in the final state of the matrix. The row elements in the output matrix should NOT be separated by whitespace.
Constraints
•	The directions will always lead to coordinates in the matrix.
•	There will always be two positions marked with "T", representing the tunnel in the race route.
•	The size of the square matrix (race route) will be between [4…10].

3. Animal Shelter

Preparation
Download the skeleton provided in Judge. Do not change the packages!
Pay attention to name the package shelter, all the classes, their fields, and methods the same way they are presented in the following document. It is also important to keep the project structure as described.
Problem Description
Your task is to create a repository, which stores items by creating the classes described below.
First, write a Java class Animal with the following fields:
•	name: String
•	age: int
•	caretaker: String
The class constructor should receive a name, age and caretaker.  You need to create the appropriate getters and setters. The class should override the toString() method in the following format:
"{name} {age} ({caretaker})"
Next, write a Java class Shelter that has data (a List, which stores the Animals). All entities inside the repository have the same fields. Also, the Shelter class should have those fields:
•	capacity: int
The class constructor should receive capacity, also it should initialize the data with a new instance of the collection. Implement the following features:
•	Field data – List that holds added animals
•	Method add(Animal animal) – adds an entity to the data if there is an empty cell for the animal.
•	Method remove(String name) – removes the animal by given name, if such exists, and returns boolean.
•	Method getAnimal(String name, String caretaker) – returns the animal with the given name and caretaker or null if no such animal exists.
•	Method getOldestAnimal() – returns the oldest Animal.
•	Getter getCount – returns the number of animals.
•	getStatistics() – returns a String in the following format:
o	"The shelter has the following animals:
{name} {caretaker}
{name} {caretaker} 
   (…)"
Constraints
•	The combinations of names and caretakers will always be unique.
•	The age of the animals will always be positive.


