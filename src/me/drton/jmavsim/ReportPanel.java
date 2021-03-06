package me.drton.jmavsim;

import java.awt.*;

/**
 * A UI panel containing the simulation report.
 */
public class ReportPanel extends Panel {
    private final TextArea textArea;

    public ReportPanel() {
        super(new BorderLayout());

        textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setEditable(false);
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        textArea.setPreferredSize(new Dimension(300, 0));

        add("Center", textArea);
    }

    public void setText(String report) {
        textArea.setText(report);
    }
}
