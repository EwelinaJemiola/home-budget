package homebudget.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Expense {

    private Long id;

    private ExpenseCategory category;

    private BigDecimal expenseAmount;

    private String expensePlace;

    private PaymentMethod method;

    @Column(nullable = false)
    private String expenseTitle;

    private boolean deleted;

    private LocalDate expenseDate;

    private LocalDateTime creationDateTime;

    public Expense() {
        //empty
    }

    public Expense(Long id, ExpenseCategory category, BigDecimal expenseAmount, String expensePlace, PaymentMethod method, String expenseTitle, boolean deleted, LocalDate expenseDate, LocalDateTime creationDateTime) {
        this.id = id;
        this.category = category;
        this.expenseAmount = expenseAmount;
        this.expensePlace = expensePlace;
        this.method = method;
        this.expenseTitle = expenseTitle;
        this.deleted = deleted;
        this.expenseDate = expenseDate;
        this.creationDateTime = creationDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpensePlace() {
        return expensePlace;
    }

    public void setExpensePlace(String expensePlace) {
        this.expensePlace = expensePlace;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", category=" + category +
                ", expenseAmount=" + expenseAmount +
                ", expensePlace='" + expensePlace + '\'' +
                ", method=" + method +
                ", expenseTitle='" + expenseTitle + '\'' +
                ", deleted=" + deleted +
                ", expenseDate=" + expenseDate +
                ", creationDateTime=" + creationDateTime +
                '}';
    }
}
