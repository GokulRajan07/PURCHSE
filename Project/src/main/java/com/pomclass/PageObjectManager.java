package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	public static WebDriver driver;
	private Pom1 p;
	private Pom2 q;
	private Pom3 r;
	private Pom4 s;
	private Pom5 t;
	private Pom6 u;
	private Pom7 v;
	private Pom8 w;
	private Pom9 x;
	private Pom99 y;

	public PageObjectManager(WebDriver driver2) {
       this.driver = driver2;
       PageFactory.initElements(driver2, this);}



	public Pom1 getInstancePom1() {
       p = new Pom1(driver);
       return p; }
	
	public Pom2 getInstancePom2() {
       q = new Pom2(driver);
       return q; }
	
	public Pom3 getInstancePom3() {
       r = new Pom3(driver);
       return r; }
	
	public Pom4 getInstancePom4() {
       s = new Pom4(driver);
       return s; }
	
	public Pom5 getInstancePom5() {
       t = new Pom5(driver);
       return t; }
	
	public Pom6 getInstancePom6() {
       u = new Pom6(driver);
       return u; }
	
	public Pom7 grtInstancePom7() {
       v = new Pom7(driver);
       return v; }
	
	public Pom8 getInstancePom8() {
       w = new Pom8(driver);
       return w; }
	
	public Pom9 getInstancePom9() {
       x = new Pom9(driver);
       return x; }
	
	public Pom99 getInstancePom99() {
       y = new Pom99(driver);
       return y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}