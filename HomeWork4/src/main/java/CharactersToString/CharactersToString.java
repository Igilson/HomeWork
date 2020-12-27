package CharactersToString;
public class CharactersToString {

    public void Alphabet1() {
        for(char Alphabet = 'A'; Alphabet <= 'Z'; Alphabet++)
        {
            System.out.println(Alphabet);
        }

    }
    public void Alphabet2() {
        for(char Alphabet = 'z'; Alphabet >= 'a'; Alphabet--)
        {
            System.out.println(Alphabet);
        }

    }
    public void Alphabet3() {
        for(char Alphabet = 'а'; Alphabet <= 'я'; Alphabet++)
        {
            System.out.println(Alphabet);
        }

    }
    public void Numerals() {
        for(char Numerals = '0'; Numerals <= '9'; Numerals++)
        {
            System.out.println(Numerals);
        }

    }
    public void ASCII() {
        for(int DEC = 32; DEC <= 126; DEC++)
        {
            char ASCII = (char)DEC;
            System.out.println(ASCII);
        }
    }
}
