package deqo.gper.mysimplestack;


public class App 
{
    public static void main( String[] args )
    {
        StackOfGateau stackOfGateau = new StackOfGateau(100);
        stackOfGateau.push(new Gateau("ChocolateCake","Chocolate",1));
        stackOfGateau.push(new Gateau("Cookies","Chocolate",1));
        stackOfGateau.push(new Gateau("MousseAuChocolat","Chocolate",1));
        stackOfGateau.push(new Gateau("Brownies","Chocolate",1));

        System.out.println(stackOfGateau.toString());

    }
}
