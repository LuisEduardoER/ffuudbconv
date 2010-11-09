package com.silentlexx.ffuudbconv;

import javax.swing.SwingUtilities;

public class Main {
	static boolean DEBUG = false;
	public static String iocharset = "UTF8";
	public static Debug D;
	public static CSV_Reader CSV;
	public static SQL_Writer SQL;
	static FieldsInfo fields_info;
	static String csv_f = "in.csv";
	static String sql_f = "out.sql";
	static String templ_f="trafaret.sql";
	static Gui gui;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	if (args.length == 2)  {csv_f = args[0];}
	if (args.length == 3)  {csv_f = args[0];templ_f = args[1];}
	if (args.length == 4)  {csv_f = args[0];templ_f = args[1];sql_f = args[2];}
	if (args.length == 5)  {csv_f = args[0];templ_f = args[1];sql_f = args[2]; DEBUG = true;}
	DEBUG = true;
	D = new Debug(DEBUG);
	
	fields_info = new FieldsInfo(templ_f);
	CSV = new CSV_Reader(csv_f,fields_info);
	
	D.p("Num SQL in main "+fields_info.getNumSQL());
	startGUI();
	}
	
	public static void doSQL(){
		SQL = new SQL_Writer(sql_f,csv_f,fields_info);
		
		
	}

	static void startGUI() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				gui = new Gui(fields_info);
			}
		});
	}
	static void tests() {

		
	}
	
}
