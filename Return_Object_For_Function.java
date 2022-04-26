class Complex
{
 float real,image;
 void getData(float x,float y)
 {
  real=x;
  image=y;
 }
 void display()
 {
  System.out.println("real="+real);
  System.out.println("image="+image);
 }
 Complex add(Complex k)
 {
  Complex s=new Complex();
  s.real=real+k.real;
  s.image=image+k.image;
  return s;
 }
}
class Return_Object_For_Function
{
 public static void main(String arg[])
 { 
  Complex t=new Complex();
  Complex p=new Complex();
  Complex q=new Complex();
  t.getData(2.3f,4.5f);
  p.getData(3.4f,5.3f);
  q=t.add(p);
  t.display();
  p.display();
  q.display();
 }
} 