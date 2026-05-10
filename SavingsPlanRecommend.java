import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxSmartPlanner {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TaxSmart - Tax Saving Planner");
        frame.setSize(800, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Heading
        JLabel heading = new JLabel("TaxSmart - Personalized Tax Saving Recommendation");
        heading.setBounds(120, 20, 600, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setForeground(Color.BLUE);
        panel.add(heading);

        // Salary Input
        JLabel salaryLabel = new JLabel("Enter Annual Salary (₹):");
        salaryLabel.setBounds(80, 100, 250, 30);
        salaryLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(salaryLabel);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(320, 100, 250, 30);
        panel.add(salaryField);

        // Age Input
        JLabel ageLabel = new JLabel("Enter Your Age:");
        ageLabel.setBounds(80, 160, 250, 30);
        ageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(320, 160, 250, 30);
        panel.add(ageField);

        // Generate Button
        JButton recommendButton = new JButton("Generate Tax Saving Plan");
        recommendButton.setBounds(250, 230, 300, 40);
        recommendButton.setBackground(new Color(0, 102, 204));
        recommendButton.setForeground(Color.WHITE);
        recommendButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(recommendButton);

        // Result Area
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setFont(new Font("Serif", Font.PLAIN, 17));

        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(50, 320, 680, 240);
        panel.add(scrollPane);

        // Button Action
        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    double salary = Double.parseDouble(salaryField.getText());
                    int age = Integer.parseInt(ageField.getText());

                    StringBuilder recommendation = new StringBuilder();

                    recommendation.append("===== YOUR PERSONALIZED TAX SAVING PLAN =====\n\n");

                    // 80C Suggestions
                    recommendation.append("1. Section 80C Investments\n");
                    recommendation.append("- Invest up to ₹1.5 Lakhs in:\n");
                    recommendation.append("  • PPF\n");
                    recommendation.append("  • ELSS Mutual Funds\n");
                    recommendation.append("  • EPF\n");
                    recommendation.append("  • Life Insurance\n\n");

                    // NPS Suggestion
                    recommendation.append("2. National Pension Scheme (NPS)\n");
                    recommendation.append("- Additional ₹50,000 tax deduction available.\n");
                    recommendation.append("- Recommended by top CA professionals.\n\n");

                    // Health Insurance
                    recommendation.append("3. Health Insurance (80D)\n");

                    if (age >= 60) {
                        recommendation.append("- Claim up to ₹50,000 for senior citizen medical insurance.\n\n");
                    } else {
                        recommendation.append("- Claim up to ₹25,000 for health insurance.\n\n");
                    }

                    // Salary Based Suggestions
                    if (salary <= 700000) {

                        recommendation.append("4. Suggested Strategy for Your Salary Range\n");
                        recommendation.append("- Use Old Tax Regime with deductions.\n");
                        recommendation.append("- Maximize 80C + HRA + NPS benefits.\n");
                        recommendation.append("- Focus on ELSS and PPF investments.\n\n");

                    } else if (salary > 700000 && salary <= 1500000) {

                        recommendation.append("4. Suggested Strategy for Mid Income Professionals\n");
                        recommendation.append("- Compare New vs Old Tax Regime carefully.\n");
                        recommendation.append("- Use Home Loan + HRA benefits if applicable.\n");
                        recommendation.append("- Invest in tax-saving mutual funds.\n\n");

                    } else {

                        recommendation.append("4. High Income Tax Planning Strategy\n");
                        recommendation.append("- Maximize all deductions.\n");
                        recommendation.append("- Invest through NPS + ELSS + Insurance.\n");
                        recommendation.append("- Consider salary restructuring.\n");
                        recommendation.append("- Consult a Chartered Accountant for advanced planning.\n\n");
                    }

                    // Final Advice
                    recommendation.append("FINAL TAXSMART ADVICE\n");
                    recommendation.append("- Maintain investment proofs.\n");
                    recommendation.append("- Submit declarations on time.\n");
                    recommendation.append("- Start tax planning from beginning of financial year.\n");

                    resultArea.setText(recommendation.toString());

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(frame,
                            "Please enter valid Salary and Age.",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
