package daily_billing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DailyBilling {
    public static void main(String[] args) {

        Billing billingEntity;
        List<Billing> billings = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            JSONArray billingsArray = (JSONArray) parser.parse(
                    new InputStreamReader(new FileInputStream("dados.json")));
            for (Object archive : billingsArray) {
                JSONObject billing = (JSONObject) archive;
                Integer dia = Integer.parseInt(billing.get("dia").toString());
                Float valor = Float.parseFloat(billing.get("valor").toString());

                billingEntity = new Billing();
                billingEntity.setDia(dia);
                billingEntity.setValor(valor);

                billings.add(billingEntity);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Collections.sort(billings);
        System.out.println("================== SORTED LIST ==================");
        System.out.println(billings);

        System.out.println("================== LOWER VALUE ==================");
        Optional<Billing> first = billings.stream()
                .filter(entity -> entity.getValor() > 0)
                .findFirst();
        System.out.println(first);

        System.out.println("================== GREATER LIST ==================");
        Optional<Billing> max = billings.stream().max(Billing::compareTo);
        System.out.println(max);

        int daysQuantity = 0;
        float valuesSum = 0;
        for (int i = 0; i < billings.size(); i++) {
            if (billings.get(i).getValor() > 0) {
                daysQuantity++;
                valuesSum += billings.get(i).getValor();
            }
        }
        System.out.println("================== AVERAGE ==================");
        float average = valuesSum / daysQuantity;
        System.out.println(average);

        int daysValueWasGreaterAverage = 0;
        for (int i = 0; i < billings.size(); i++) {
            if (billings.get(i).getValor() > average) {
                daysValueWasGreaterAverage++;
            }
        }

        System.out.println("================== DAYS'S QUANTITY THAT VALUE WAS GREATER AVERAGE==================");
        System.out.println(daysValueWasGreaterAverage);

    }
}
