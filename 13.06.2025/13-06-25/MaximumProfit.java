 import java.util.Arrays;
        public class Main{
            public static void main(String[]args){
                System.out.println("maximum profit="+napSack(8,0,new int[]{1,3,5,7},new int[]{2,4,7,10}));
            }
            public static int napSack(int bagWeight,int selectedElement,int[]weights,int[]profits){
                if(selectedElement>=weights.length||bagWeight==0){
                    return 0;
                }
                int pick=0;
                if(bagWeight>=weights[selectedElement]){
                    pick=profits[selectedElement]+napSack(bagWeight-weights[selectedElement],selectedElement+1,weights,profits);
                }
                int notPick=napSack(bagWeight,selectedElement+1,weights,profits);
                return Math.max(pick,notPick);
                
        }
        }