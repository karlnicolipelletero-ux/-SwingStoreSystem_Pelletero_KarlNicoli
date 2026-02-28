Java Store Management System:
This is a simple Java Swing desktop application that simulates a store checkout system. Following the project instructions, this program was built using only basic arrays and Object-Oriented Programming (OOP). No Java Collections (like ArrayList) were used.

Features (The 3 Frames)
  1. Store Menu (Frame 1): The main checkout screen. Users can select an item (Rice, Sugar, Coffee, Milk), adjust the quantity using + and - buttons, and buy it. It prevents negative numbers and checks if there is enough stock.

  2.Transaction Logs (Frame 2): A simple receipt screen. It shows a history of every successful purchase, including the item name, quantity, and total price.

  3. Inventory (Frame 3): A live stock tracker. It shows the current price of every item and exactly how many units are left in the store. It updates automatically when someone buys an item.

How the Code Works
Instead of using ArrayList, all data is stored in standard, fixed-size arrays:

Store Items: Parallel arrays hold the products (String), prices (double), and inventory (int).

Receipts: The transaction history is saved in parallel arrays with a maximum size of 100. A counter (logCount) keeps track of where to save the next receipt.

Screenshots


Frame 1: <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/964a7204-9f7d-4655-9014-9c31b263d92a" />

Frame 2: <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/781f7ced-6d52-4538-b97a-97679fe74cec" />

Frame 3: <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/39948695-796a-4ea1-9013-90aca0c7704e" />
