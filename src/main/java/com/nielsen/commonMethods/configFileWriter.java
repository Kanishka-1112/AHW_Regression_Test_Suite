/*
 * package com.nielsen.commonMethods;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.FileNotFoundException; import java.io.FileOutputStream; import
 * java.io.IOException; import java.util.Properties;
 * 
 * public class configFileWriter {
 * 
 * private static final String propertyFilePath= "config.properties";
 * 
 * public static void setConfigsFileProperty(String propName, String propVal) {
 * File configFile = new File(propertyFilePath); try { Properties props = new
 * Properties(); FileInputStream in = new FileInputStream(configFile);
 * props.load(in); in.close(); props.setProperty(propName, propVal);
 * FileOutputStream writer = new FileOutputStream(configFile);
 * props.store(writer, "Configs settings"); writer.close(); } catch
 * (FileNotFoundException ex) { // file does not exist } catch (IOException ex)
 * { // I/O error }
 * 
 * }
 * 
 * }
 */