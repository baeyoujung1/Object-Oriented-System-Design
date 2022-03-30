package lab01;

public class WordFinder {

	   public static void main(String[] args) {
	      String text = "Senior members of the Ukrainian delegation who spoke with Russian officials today said there was progress after a day of talks in Turkey — and provided more detail on what security guarantees Ukraine would expect after a ceasefire. Mykhailo Podolyak, an adviser to Ukrainian President Volodymyr Zelensky, referred to talks about the status of Crimea, which annexed by Russia in 2014. \"I want to emphasize as regards the territories of Crimea and Sevastopol, it was agreed in bilateral format to take a pause for 15 years and conduct bilateral talks on the status of these territories,\" he said. Ukraine and the West have refused to recognize the Russian annexation of the peninsula, and the pause could be a formula for taking the issue off the table for now. \"Separately, we discussed that during 15 years while the bilateral talks take place, there will be no military hostilities,\" Podolyak added. He also referred to one of the toughest elements in the talks: security guarantees for Ukraine if and when a ceasefire and peace settlement are agreed upon. \"Undoubtedly, this treaty on security guarantees may only be signed after a ceasefire and the complete withdrawal of Russian troops to their positions on the 23rd of February 2022,\" he said. \"We are simply bringing our proposals as negotiators to Russia about the system of security guarantees of Ukraine,\" he continued. Podolyak said the Russian negotiators have \"taken the treaty that outlines ways to end the war\" and will work out their counter-proposals. He added that both sides are still \"discussing a humanitarian ceasefire,\" stressing there are \"many places where humanitarian corridors are needed.\" Another member of the Ukrainian team, David Arakhamia, also spoke about security guarantees. \"We insist that this be an international treaty, signing all the guarantors of security, which will be ratified.\" He said this would be comparable to NATO's Article 5, which enshrines the principle of collective defense. The arrangement, he said, would be similar to Article 5, \"but even with a stricter activation mechanism.\" \"We say that consultations should take place within three days. They need to find out if this is war, aggression, a military operation. ... After that, the guarantor countries are obliged to help us. And military aid, and the armed forces, and weapons, and the closed sky — all that we need so much now, and we cannot get it. This is our proposal,\" he said. Arakhamia named the guarantors as \"the [permanent] countries of the UN Security Council\" as well as Turkey, Germany, Canada, Italy, Poland and Israel. \"We have stipulated in this agreement that the guarantor countries must not only not deny Ukraine's accession to the EU, but also help with it,\" he said. Arakhamia added: \"Of course, we have unresolved issues with the occupied parts of Donetsk and Luhansk regions, with Crimea and Sevastopol. And international security guarantees will not work temporarily in these territories.\" A third member of the Ukrainian delegation, Oleksandr Chalyi, also stressed the three-day deadline for consultations in the event of \"any aggression, military attack or military operation.\" \"And if these consultations do not lead to a diplomatic solution to the problem, the guarantor countries must provide us with military assistance, weapons, and even we include such a situation as closed airspace over Ukraine,\" Chalyi said. Speaking to Ukrainian television, he said: \"Doing everything possible to restore Ukraine's security is a key requirement. If we manage to consolidate these key provisions, which is the most fundamental requirement for us, Ukraine will in fact be in a position to fix its current status as a non-aligned and non-nuclear state in the form of permanent neutrality.\" \"Accordingly, these guarantees, which are in fact in line with NATO Article 5, as required by our country's Constitution. [We] will not deploy foreign military bases or military contingents on our territory, and we will not enter into military-political alliances. Military trainings in our country will be conducted with the consent of our guarantor countries,\" Chalyi said. \"However, it is fundamental for us that nothing in these provisions will deny our accession to the EU. The guarantor countries are also committed to facilitating these processes,\" he added.";
	      
	      SearchResult russia = new SearchResult("russia");
	      for (String word : text.split("\\W+")) {
	         if (russia.found(word)) {
	            russia.increaseCount();
	         }
	      }
	      
	      System.out.println(russia);
	   }

}
