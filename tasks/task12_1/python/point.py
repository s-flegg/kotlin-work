# Task 12.1: Point class

from math import hypot

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def distance(self) -> Float:
        return hypot(self.x, self.y)
    def distanceTo(self, p: Point) -> Float:
        return hypot(self.x-p.x, self.y-p.y)