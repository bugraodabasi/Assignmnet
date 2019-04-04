package deneme;

public class Gpa {
	private double ders1;
	private double ders2;
	private double ders3;
	private double ders4;
	private double ders5;
	private double ortalama;

void Gpa()
{
	this.ders1=ders1;
	this.ders2=ders2;
	this.ders3=ders3;
	this.ders4=ders4;
	this.ders5=ders5;
	this.hesOrt();
	
}

public void Gpa(double dr1,double dr2,double dr3,double dr4,double dr5)
{
	this.ders1=dr1;
	this.ders2=dr2;
	this.ders3=dr3;
	this.ders4=dr4;
	this.ders5=dr5;
	
}
public void setDers1(double d1)
{
	this.ders1=d1;

}
public void setDers2(double d2)
{
	this.ders2=d2;
	
}
public void setDers3(double d3)
{
	this.ders3=d3;

}
public void setDers4(double d4)
{
	this.ders4=d4;

}
public void setDers5(double d5)
{
	this.ders5=d5;
}

public double getDers1()
{
	return this.ders1;
}
public double getDers2()
{
	return this.ders2;
}
public double getDers3()
{
	return this.ders3;
}
public double getDers4()
{
	return this.ders4;
}
public double getDers5()
{
	return this.ders5;
}

public void hesOrt()
{
	this.ortalama=(this.ders1+this.ders2+this.ders3+this.ders4+this.ders5)/5;
}
public double getOrt()
{
	return this.ortalama;
}
}