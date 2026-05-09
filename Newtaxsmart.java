import javax.swing.*;
import java.awt.*;

public class TaxSmartBlog {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TaxSmart - Tax Saving Guide");
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Header this is the title of the blog Added change 4 here
        JLabel header = new JLabel("TaxSmart - Smart Tax Saving Methods for Salaried Employees", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        header.setForeground(new Color(0, 102, 204));
        header.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        // Blog Content
        JTextArea blogContent = new JTextArea();
        blogContent.setEditable(false);
        blogContent.setLineWrap(true);
        blogContent.setWrapStyleWord(true);
        blogContent.setFont(new Font("Serif", Font.PLAIN, 18));

        String content =
                "WELCOME TO TAXSMART\n\n" +

                "Top CA Recommended Tax Saving Methods for Salaried Employees in India\n\n" +

                "1. Section 80C Deductions (Maximum ₹1.5 Lakhs)\n" +
                "Highly skilled Chartered Accountants suggest investing under Section 80C to reduce taxable income.\n" +
                "Popular options include:\n" +
                "- Employee Provident Fund (EPF)\n" +
                "- Public Provident Fund (PPF)\n" +
                "- ELSS Mutual Funds\n" +
                "- Life Insurance Premium\n" +
                "- Tax Saving Fixed Deposits\n" +
                "- Principal repayment of Home Loan\n\n" +

                "2. Health Insurance under Section 80D\n" +
                "Salaried employees can claim deductions on health insurance premiums.\n" +
                "- ₹25,000 for self and family\n" +
                "- Additional ₹25,000 for parents\n" +
                "- ₹50,000 for senior citizen parents\n\n" +

                "3. House Rent Allowance (HRA)\n" +
                "If you live in a rented house, claim HRA exemption by submitting rent receipts.\n" +
                "This is one of the most used techniques recommended by tax experts.\n\n" +

                "4. National Pension Scheme (NPS)\n" +
                "Experts recommend NPS for long term wealth creation and extra tax benefits.\n" +
                "Additional deduction up to ₹50,000 under Section 80CCD(1B).\n\n" +

                "5. Leave Travel Allowance (LTA)\n" +
                "Employees can claim tax exemption on domestic travel expenses.\n" +
                "Available for travel within India.\n\n" +

                "6. Home Loan Benefits\n" +
                "- Deduction up to ₹2 Lakhs on home loan interest under Section 24(b)\n" +
                "- Principal repayment covered under 80C\n\n" +

                "7. Standard Deduction\n" +
                "Government provides standard deduction for salaried employees.\n" +
                "This automatically reduces taxable salary income.\n\n" +

                "8. Education Loan Deduction\n" +
                "Interest paid on education loans can be claimed under Section 80E.\n" +
                "No upper limit on interest amount.\n\n" +

                "9. Tax Free Allowances\n" +
                "Some allowances provided by employers can help save taxes:\n" +
                "- Food Coupons\n" +
                "- Telephone Bills\n" +
                "- Internet Reimbursement\n" +
                "- Fuel Reimbursement\n\n" +

                "10. Choosing the Correct Tax Regime\n" +
                "Top CA professionals advise employees to compare old and new tax regimes carefully.\n" +
                "Old regime benefits people with investments and deductions.\n" +
                "New regime may suit individuals with fewer deductions.\n\n" +

                "FINAL TAXSMART ADVICE\n" +
                "Always maintain proper documentation, investment proofs, and rent receipts.\n" +
                "Consult a qualified Chartered Accountant before making large financial decisions.\n\n" +

                "© 2026 TaxSmart India | Smart Tax Planning for Salaried Professionals";

        blogContent.setText(content);

        JScrollPane scrollPane = new JScrollPane(blogContent);

        // Footer
        JLabel footer = new JLabel("Designed by TaxSmart", JLabel.CENTER);
        footer.setFont(new Font("Arial", Font.BOLD, 14));
        footer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(header, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(footer, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}