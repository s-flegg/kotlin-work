# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!

from point import Point

p = Point(1.0, 2.0)
print(f"x: {p.x} \ny: {p.y}")
print(f"Distance from origin: {p.distance()}")

p2 = Point(4.5, 7.0)
print(f"Distance between points: {p.distanceTo(p2)}")