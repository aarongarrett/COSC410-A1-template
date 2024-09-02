Write a program (in a file/class called "App.java") that reads command line arguments and calculates the volume of a three-dimensional shape. The arguments should come in two possible forms:

X Y Z --type shape

X Y Z

X, Y, and Z are all real numbers, and shape is one of the following strings: box, pyramid, ellipsoid

The program should calculate the volume of the given shape. If no shape is specified (using the second variant), assume that the shape is a box. Formulas for calculating the volumes can be found with an internet search.

Examples:

java Main 8 2 3    [outputs 48.0]

java Main 8 2 3 --type pyramid    [outputs 16.0]

java Main 8 2 3 --type box    [outputs 48.0]





