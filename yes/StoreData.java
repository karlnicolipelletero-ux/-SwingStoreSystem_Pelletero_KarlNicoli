package yes;

public class StoreData {

    // --- PRIVATE ARRAYS (Encapsulation) ---
    private String[] products = {"Rice", "Sugar", "Coffee", "Milk"};
    private double[] prices = {50.0, 60.0, 150.0, 80.0};
    private int[] inventory = {20, 20, 20, 20};

    // --- ARRAYS FOR TRANSACTION LOGS (Fixed size of 100) ---
    private String[] logNames = new String[100];
    private int[] logQuantities = new int[100];
    private double[] logTotals = new double[100];

    // Index counter to track the number of transactions
    private int logCount = 0;

    // --- GETTER METHODS ---
    // These allow your frames to safely read the data
    public String[] getProducts() {
        return products;
    }

    public double[] getPrices() {
        return prices;
    }

    public int[] getInventory() {
        return inventory;
    }

    public int getLogCount() {
        return logCount;
    }

    public String getLogName(int index) {
        return logNames[index];
    }

    public int getLogQuantity(int index) {
        return logQuantities[index];
    }

    public double getLogTotal(int index) {
        return logTotals[index];
    }

    // --- LOGIC METHOD ---
    public boolean processTransaction(int productIndex, int quantity) {
        // Prevent negative quantities
        if (quantity < 0) {
            return false;
        }
        // Prevent transactions exceeding available stock
        if (quantity > inventory[productIndex]) {
            return false;
        }

        // Deduct from inventory
        inventory[productIndex] = inventory[productIndex] - quantity;

        // Save transaction details to arrays
        if (logCount < 100) {
            logNames[logCount] = products[productIndex];
            logQuantities[logCount] = quantity;
            logTotals[logCount] = prices[productIndex] * quantity;
            logCount++;
        }
        return true;
    }
}
