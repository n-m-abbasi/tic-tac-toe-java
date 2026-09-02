# TicTacToe Java Console Game

A simple and clean **3x3 Tic Tac Toe** game written in Java, playable directly in the console.  
This project is perfect for beginners who want to practice Java fundamentals such as arrays, loops, input validation, and basic game logic.

---

## 🎮 Features
- Two‑player gameplay (X and O)
- Clear and readable board rendering
- Input validation to prevent invalid moves
- Automatic winner detection
- Draw detection when no moves remain
- Fully console‑based and lightweight

---

## 📂 Project Structure
```
TicTacToe.java
```

All game logic is contained in a single Java file for simplicity and ease of understanding.

---

## ▶️ How to Run

1. Install **Java 8+**
2. Compile the program:
   ```bash
   javac TicTacToe.java
   ```
3. Run the game:
   ```bash
   java TicTacToe
   ```

---

## 🧠 Game Logic Overview
- The board is stored in a `String[]` of size 9.
- Players choose a slot number (1–9).
- After each move, the game checks:
  - 3 horizontal lines  
  - 3 vertical lines  
  - 2 diagonal lines  
- If no winner and no empty slots remain → **draw**

---

## 📜 Example Gameplay

```
Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|

X will play first. Enter a slot number:
```

---

## 🏆 Future Improvements
- Add AI opponent (Minimax algorithm)
- Add GUI version using JavaFX
- Add score tracking system
- Add restart option without exiting the program


---برای ادامه:  
- زیباسازی README  
- لوگو برای پروژه
