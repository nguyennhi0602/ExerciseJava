public class Exercise6 {
    public String sloveEquation(double a,double b,double c){
        double x1,x2,denta;
        if(a==0){
            if(b==0){
                if(c==0){
                    return "Phuong trinh vo so nghiem";
                }else{
                    return "Phuong trinh vo nghiem";
                }
            }else{
                return "Phuong trinh co nghiem: "+(-c/b);
            }
        }else{
            denta=b*b-4*a*c;
            if(denta<0){
                return "Phuong trinh vo nghiem";
            }
            if(denta==0){
                x1=x2=(-b/(2*a));
                return "Phuong trinh co nghiem kep: "+x1;
            }
            x1=(-b+Math.sqrt(denta))/(2*a);
            x2=(-b-Math.sqrt(denta))/(2*a);
            return "Phuong trinh co hai nghiem x1= "+x1+" x2= "+x2;
        }
    }
}
