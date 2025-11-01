# Pet Info  
A modular Java practice series

Collection of small console programs demonstrating OOP, functional style, and asynchronous programming through pet-related examples.

---

## Project layout
Each task is a separate sub-project:  
`Task01/src`, `Task02/src`, …, `Task06/src`

If task N continues task N-1, copy the previous folder and extend the code there.

---

## Task 01 – Pet List  
Read the number of pets.  
Then for each: type (`dog` / `cat`), name, age.  

Create:
- abstract class `Animal` with private `name`, `age` and getters  
- classes `Dog` and `Cat` extending `Animal`  
- `toString()` →  
  - `Dog name = Rex, age = 5`  
  - `Cat name = Kitty, age = 3`

Invalid input:
- wrong type → `Incorrect input. Unsupported pet type`
- non-positive age → `Incorrect input. Age <= 0`
- parsing error → `Could not parse a number. Please, try again`

---

## Task 02 – Pet Feed Amount  
Add a weight field and calculate food portion (kg per meal).

Create:
- `getFeedInfoKg()` in `Animal` (abstract)
- `Dog`: feed = `weight × 0.3`
- `Cat`: feed = `weight × 0.1`

Output format:  
`Dog name = Rex, age = 5, mass = 10.00, feed = 3.00`

Extra checks:
- mass ≤ 0 → `Incorrect input. Mass <= 0`

---

## Task 03 – Herbivores & Omnivores  
Print herbivorous pets first, then omnivorous ones.

Create:
- interfaces `Herbivore` (chill()) and `Omnivore` (hunt())
- classes:  
  - `Hamster`, `GuineaPig` → Herbivore  
  - `Dog`, `Cat` → Omnivore  

Examples:
```
GuineaPig name = Piggy, age = 5. I can chill for 12 hours
Dog name = Rex, age = 8. I can hunt for robbers
```

---

## Task 04 – Increase Age (Functional)  
Use the Stream API to increment age +1 for pets older than 10.

Rules:
- functional paradigm only (no loops)
- after processing, print all pets
- invalid input handled as before

---

## Task 05 – Async Walk Tracker  
Track pet walks in parallel threads.

For each pet:
- `goToWalk()` returns walk time (s)
- Dog → `age × 0.5`  
- Cat → `age × 0.25`
- run each in its own thread; wait for all to finish

Output example:  
`Dog name = Rex, age = 5, start time = 0.10, end time = 2.60`

Start-time difference between pets ≤ 1 s.

---

## Task 06 – Pet Iterator  
Implement a custom iterator over the list of animals.

Create:
- interface `BaseIterator<T>` → `next()`, `hasNext()`, `reset()`
- class `AnimalIterator` holding list + index

Iterate through pets using this iterator only.

---

## Goals
- Practice core OOP patterns in Java  
- Use abstract classes & interfaces  
- Apply functional and asynchronous paradigms  
- Handle console input safely  
- Build reusable, independent modules

---

## Build & Run
Compile and run any task from its `TaskNN` directory using your preferred method (CLI, IDE, build tool).  
No external libraries — only standard JDK is required.
