/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.*;

import shell.Shell;
import gui.types.*;
import database.CourseAccess;
import difflib.*;

/**
 *
 * @author Jordan Toering, Graeme Smith
 */
public class TestSuite extends MSPanel {
    private String submission_fp;
    private String solution_fp;
    private int numTests;
    private String actName;
    private String courseID;

     public TestSuite(String submission_fp, String solution_fp, int numTests, String actName, String courseID) {
        super("Test Suite");

        this.submission_fp = submission_fp;
        this.solution_fp = solution_fp;
        this.numTests = numTests;
        this.actName = actName;
        this.courseID = courseID;

        initComponents();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubric_panel = new javax.swing.JPanel();
        solution_scrollpane = new javax.swing.JScrollPane();
        solution_output_text_area = new javax.swing.JTextArea();
        submitted_panel = new javax.swing.JPanel();
        submission_scrollpane = new javax.swing.JScrollPane();
        submission_output_test_area = new javax.swing.JTextArea();
        solution_panel = new javax.swing.JPanel();
        diff_scrollpane = new javax.swing.JScrollPane();
        diff_text_area = new javax.swing.JTextArea();
        run_button = new javax.swing.JButton();

        rubric_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Solution Output"));
        rubric_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        rubric_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        solution_output_text_area.setEditable(false);
        solution_output_text_area.setColumns(20);
        solution_output_text_area.setRows(5);
        solution_scrollpane.setViewportView(solution_output_text_area);

        javax.swing.GroupLayout rubric_panelLayout = new javax.swing.GroupLayout(rubric_panel);
        rubric_panel.setLayout(rubric_panelLayout);
        rubric_panelLayout.setHorizontalGroup(
            rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(solution_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        rubric_panelLayout.setVerticalGroup(
            rubric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rubric_panelLayout.createSequentialGroup()
                .addComponent(solution_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        submitted_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Submission Output"));
        submitted_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        submitted_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        submission_output_test_area.setEditable(false);
        submission_output_test_area.setColumns(20);
        submission_output_test_area.setRows(5);
        submission_scrollpane.setViewportView(submission_output_test_area);

        javax.swing.GroupLayout submitted_panelLayout = new javax.swing.GroupLayout(submitted_panel);
        submitted_panel.setLayout(submitted_panelLayout);
        submitted_panelLayout.setHorizontalGroup(
            submitted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submission_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        submitted_panelLayout.setVerticalGroup(
            submitted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submission_scrollpane)
        );

        solution_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Diff"));
        solution_panel.setMinimumSize(new java.awt.Dimension(400, 500));
        solution_panel.setPreferredSize(new java.awt.Dimension(400, 500));

        diff_text_area.setEditable(false);
        diff_text_area.setColumns(20);
        diff_text_area.setRows(5);
        diff_scrollpane.setViewportView(diff_text_area);

        javax.swing.GroupLayout solution_panelLayout = new javax.swing.GroupLayout(solution_panel);
        solution_panel.setLayout(solution_panelLayout);
        solution_panelLayout.setHorizontalGroup(
            solution_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diff_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        solution_panelLayout.setVerticalGroup(
            solution_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diff_scrollpane)
        );

        run_button.setText("Run Code");
        run_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(rubric_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitted_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solution_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(run_button, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solution_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rubric_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(submitted_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(run_button, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void run_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run_buttonActionPerformed
    	String result = "";
    	ArrayList<String> solution,submission;
    	if(numTests == 1) {
    		result = Shell.pythonCall(submission_fp, CourseAccess.accessTestIn(courseID, actName));
    		submission_output_test_area.setText(result);
    		submission = new ArrayList<String>(Arrays.asList(submission_output_test_area.getText().split("\n")));
    		String out = "";
    		try {
				Scanner in = new Scanner(new FileReader(CourseAccess.accessTestOut(courseID, actName)));
				while(in.hasNext())
					out += in.nextLine();
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    		solution_output_text_area.setText(out);
    		solution = new ArrayList<String>(Arrays.asList(solution_output_text_area.getText().split("\n")));
    	} else {
    		result = Shell.pythonCall(submission_fp);
    		submission_output_test_area.setText(result);
    		submission = new ArrayList<String>(Arrays.asList(submission_output_test_area.getText().split("\n")));
    		result = Shell.pythonCall(solution_fp);
    		solution_output_text_area.setText(result);
    		solution = new ArrayList<String>(Arrays.asList(solution_output_text_area.getText().split("\n")));
    	}
    	Patch patch = DiffUtils.diff(solution,submission);
    	List<String> diff = DiffUtils.generateUnifiedDiff("Solution","Submission",solution,patch,3);
    	String diffText = "";
    	for(String s : diff)
    		diffText += s + "\n";
    	if(diffText.equals(""))
    		diff_text_area.setText("No differences.");
    	else
    		diff_text_area.setText(diffText);

		DefaultHighlighter.DefaultHighlightPainter red = new DefaultHighlighter.DefaultHighlightPainter(
				java.awt.Color.RED);
		DefaultHighlighter.DefaultHighlightPainter green = new DefaultHighlighter.DefaultHighlightPainter(
				java.awt.Color.GREEN);
    	try {
    		for(int i=0; i<diffText.length(); ) {
    			if(diffText.startsWith("+",i)) {
    				diff_text_area.getHighlighter().addHighlight(diffText.indexOf("+",i),diffText.indexOf("\n",diffText.indexOf("+",i)),green);
    				i = diffText.indexOf("\n",diffText.indexOf("+",i)) + 1;
    			} else if (diffText.startsWith("-",i)){
    				diff_text_area.getHighlighter().addHighlight(diffText.indexOf("-",i),diffText.indexOf("\n",diffText.indexOf("-",i)),red);
    				i = diffText.indexOf("\n",diffText.indexOf("-",i)) + 1;
    			} else {
    				i = diffText.indexOf("\n",i) + 1;
    			}
    		}
    	} catch (BadLocationException e) {
			e.printStackTrace();
		}
    }//GEN-LAST:event_run_buttonActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane diff_scrollpane;
    private javax.swing.JTextArea diff_text_area;
    private javax.swing.JPanel rubric_panel;
    private javax.swing.JButton run_button;
    private javax.swing.JTextArea solution_output_text_area;
    private javax.swing.JPanel solution_panel;
    private javax.swing.JScrollPane solution_scrollpane;
    private javax.swing.JTextArea submission_output_test_area;
    private javax.swing.JScrollPane submission_scrollpane;
    private javax.swing.JPanel submitted_panel;
    // End of variables declaration//GEN-END:variables
}