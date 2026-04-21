import java.util.*;

// Customer Class
class Customer {
    private int id;
    private String name;
    private String phoneNo;

    public Customer(int id, String name, String phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhoneNo() { return phoneNo; }
}

// Product Class
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

// Bill Class
class Bill {
    private int billId;
    private int cId;
    private int pId;
    private int quantity;
    private double amount;
    private Date date;

    public Bill(int billId, int cId, int pId, int quantity, double price) {
        this.billId = billId;
        this.cId = cId;
        this.pId = pId;
        this.quantity = quantity;
        this.amount = calculateTotal(price);
        this.date = new Date();
    }

    public double calculateTotal(double price) {
        return price * quantity;
    }

    public void displayBill() {
        System.out.println("\n--- BILL ---");
        System.out.println("Bill ID: " + billId);
        System.out.println("Customer ID: " + cId);
        System.out.println("Product ID: " + pId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
    }
}

// Main Class
public class billingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Customer> customers = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1.Add Customer 2.Add Product 3.Generate Bill 4.Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    customers.add(new Customer(cid, cname, phone));
                    System.out.println("Customer added!");
                    break;

                case 2:
                    System.out.print("Product ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(pid, pname, price));
                    System.out.println("Product added!");
                    break;

                case 3:
                    System.out.print("Bill ID: ");
                    int bid = sc.nextInt();

                    System.out.print("Customer ID: ");
                    int bcid = sc.nextInt();

                    System.out.print("Product ID: ");
                    int bpid = sc.nextInt();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    // find product price
                    double pprice = 0;
                    for (Product p : products) {
                        if (p.getId() == bpid) {
                            pprice = p.getPrice();
                            break;
                        }
                    }

                    Bill bill = new Bill(bid, bcid, bpid, qty, pprice);
                    bill.displayBill();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}