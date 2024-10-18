# Reverse First K Elements in a Queue

This Java program provides a function to reverse the first k elements of a queue while maintaining the order of the remaining elements.

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [How It Works](#how-it-works)
- [Example](#example)
- [Dependencies](#dependencies)
- [License](#license)

## Description

The `ReverseFirstKElements` class contains a method `reverseFirstK` that takes a queue and an integer k as parameters. It reverses the first k elements of the queue and retains the order of the remaining elements.

## Usage

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/Shivam-agarawal/QueueProject.git

## How It Works

The `reverseFirstK` method operates using a combination of a queue and a stack to reverse the first k elements while maintaining the order of the remaining elements in the queue. Here’s a step-by-step breakdown of the process:

1. **Input Validation**:
   - The method first checks if the provided queue is null, if k is greater than the size of the queue, or if k is negative. If any of these conditions are true, it throws an `IllegalArgumentException`.

2. **Using a Stack**:
   - A stack is used to reverse the order of the first k elements. This is because stacks follow the Last In First Out (LIFO) principle, allowing the last element added to be the first one removed.

3. **Pushing Elements to the Stack**:
   - The method iterates through the first k elements of the queue. For each element, it removes it from the front of the queue (using `queue.poll()`) and pushes it onto the stack. After this step, the stack contains the first k elements in reverse order.

4. **Popping Elements from the Stack**:
   - The method then pops the elements from the stack one by one and adds them back to the queue (using `queue.add(stack.pop())`). At this point, the first k elements are now at the front of the queue in reversed order.

5. **Maintaining Remaining Order**:
   - Finally, the method calculates the number of remaining elements in the queue (n - k) and rotates these elements to the back of the queue. This is done by polling the front element and adding it back to the end of the queue in a loop. This ensures that the order of the remaining elements is preserved.

### Example

For example, if the original queue is `[1, 2, 3, 4, 5]` and k = 3:
- After pushing the first 3 elements onto the stack, the stack will contain `[3, 2, 1]`.
- The queue will then have the remaining elements: `[4, 5]`.
- After popping from the stack and adding back, the queue will become `[3, 2, 1, 4, 5]`.

## Dependencies

To run this Java program, ensure you have the following installed:

- **Java Development Kit (JDK) 8 or higher**: This is required to compile and run Java programs. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use an open-source alternative like [OpenJDK](https://openjdk.java.net/).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.




   


