from typing import List

# 1. Function with Type Hints
def calculate_average(numbers: List[float]) -> float:
    if not numbers:
        return 0.0
    return sum(numbers) / len(numbers)

# 2. String Formatting Demonstration
def demonstrate_formatting(name: str, score: float, rank: int):
    # Using f-string
    print(f"\nStudent: {name}\nScore: {score:.2f} (Rank: {rank})")

    # Using .format() method
    formatted = "Student: {}\nScore: {:.2f} (Rank: {:02})".format(name, score, rank)
    print("\nUsing .format():")
    print(formatted)

# Sample usage
marks = [85.5, 90.0, 78.3, 92.7]
average_score = calculate_average(marks)

# Display formatting examples
demonstrate_formatting("Priyanshu", average_score, 5)