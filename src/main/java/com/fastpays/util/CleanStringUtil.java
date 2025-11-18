package com.fastpays.util;

public class CleanStringUtil{
 public static String onlyDigits(String s){
  return s==null?null:s.replaceAll("\\D","");
 }
}
