import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class DzBirthdayGifts {
    public static void main(String[] args) {
        List<Collection<String>> boxWithASurprises= new ArrayList<>();
        boxWithASurprises.add(giftsForDad());
        boxWithASurprises.add(giftsForMother());
        boxWithASurprises.add(giftsForSun());
        boxWithASurprises.add(giftsForDaughter());
        System.out.println("Все подарки: " + "\n" + boxWithASurprises);


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        String sDadBirthsDay = "04.06";
        String sMotherBirthsDay = "08.06";
        String sSunBirthsDay = "08.01";
        String sDaughterBirthsDay = "08.05";
        try {
            Date dadBirthsDay = dateFormat.parse(sDadBirthsDay);
            Date motherBirthsDay = dateFormat.parse(sMotherBirthsDay);
            Date sunBirthsDay = dateFormat.parse(sSunBirthsDay);
            Date daughterBirthsDay = dateFormat.parse(sDaughterBirthsDay);
            System.out.println();

                System.out.println(dateFormat.format(dadBirthsDay)+" С Днем Рождения папа! ");
                System.out.println("Подарки для папы: " + giftsForDad());

                System.out.println(dateFormat.format(motherBirthsDay)+" С Днем Рождения мама! ");
                System.out.println("Подарки для мамы: " + giftsForMother());

                System.out.println(dateFormat.format(sunBirthsDay)+" С Днем Рождения сын! ");
                System.out.println("Подарки для сына: " + giftsForSun());

                System.out.println(dateFormat.format(daughterBirthsDay)+" С Днем Рождения дочь! ");
                System.out.println("Подарки для дочери: " + giftsForDaughter());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Collection<String> giftsForDad(){     //подарки для отца
        Collection<String> giftFromDad = new ArrayList<>();
        String giftFromMother = "Набор инструментов";   //подарок от матери
        String giftFromSun = "Кружка";        //подарок от сына
        String giftFromDaughter = "Открытка";    //подарок от дочери
        giftFromDad.add(giftFromMother);
        giftFromDad.add(giftFromSun);
        giftFromDad.add(giftFromDaughter);
        return giftFromDad;
    }
    private static Collection<String> giftsForMother(){     //подарки для матери
        Collection<String> giftFromMother = new ArrayList<String>();
        String giftFromDad = "Духи";
        String giftFromSun = "Букет цветов";
        String giftFromDaughter = "Рисунок";
        giftFromMother.add(giftFromDad);
        giftFromMother.add(giftFromSun);
        giftFromMother.add(giftFromDaughter);
        return giftFromMother;
    }
    private static Collection<String> giftsForSun(){       //подарки для сына
        Collection<String> giftFromSun = new ArrayList<>();
        String giftFromDad = "Велосипед";
        String giftFromMother = "Компьютер";
        String giftFromDaughter = "Открытка";
        giftFromSun.add(giftFromDad);
        giftFromSun.add(giftFromMother);
        giftFromSun.add(giftFromDaughter);
        return giftFromSun;
    }
    private static Collection<String> giftsForDaughter(){   //подарки для дочери
        Collection<String> giftFromDaughter = new ArrayList<>();
        String giftFromDad = "Доска для рисования";
        String giftFromMother = "Игрушечная кухня";
        String giftFromSun = "Мягкая игрушка";
        giftFromDaughter.add(giftFromDad);
        giftFromDaughter.add(giftFromMother);
        giftFromDaughter.add(giftFromSun);
        return giftFromDaughter;
    }
}