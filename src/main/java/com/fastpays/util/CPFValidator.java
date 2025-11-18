package com.fastpays.util;

public class CPFValidator{
 public static boolean isValidCPF(String cpf){
  if(cpf==null)return false;
  cpf=CleanStringUtil.onlyDigits(cpf);
  if(cpf.length()!=11)return false;
  if(cpf.matches("(\\d)\\1{10}"))return false;
  try{
   int sum=0;
   for(int i=0;i<9;i++) sum+=Character.getNumericValue(cpf.charAt(i))*(10-i);
   int d1=(sum*10)%11; if(d1==10)d1=0;
   if(d1!=Character.getNumericValue(cpf.charAt(9)))return false;

   sum=0;
   for(int i=0;i<10;i++) sum+=Character.getNumericValue(cpf.charAt(i))*(11-i);
   int d2=(sum*10)%11; if(d2==10)d2=0;

   return d2==Character.getNumericValue(cpf.charAt(10));
  }catch(Exception e){return false;}
 }
}
