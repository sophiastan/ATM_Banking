import java.util.ArrayList;

public class Account {

  /**
   * The name of the account
   */
  private String name;

  /**
   * The account ID number
   */
  private String uuid;

  /**
   * The User object that owns this account
   */
  private User holder;
  
  /**
   * The list of transactions for this account
   */
  private ArrayList<Transaction> transactions;

  /**
   * Create a new Account
   * @param name the name of the account
   * @param holder the User object that holds this account
   * @param theBank the bank that issues the account
   */
  public Account(String name, User holder, Bank theBank) {

    // get new account UUID
    this.uuid = theBank.getNewAccountUUID();

    // init transactions
    this.transactions = new ArrayList<Transaction>();
  }

  /**
   * Get the account ID
   * @return the uuid
   */
  public String getUUID() {
    return this.uuid;
  }
}
