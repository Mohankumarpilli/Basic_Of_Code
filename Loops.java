import java.util.*;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Loops {
   public static void main(String[] args) {
       String s1 = "mohan";
       String s2 = "karthik";
       int L_s1 = System.identityHashCode(s1);
       System.out.println(L_s1);
       s1 = s2;
       int L_s2 = System.identityHashCode(s1);
       int L_s3 = System.identityHashCode(s2);
       System.out.println(L_s2);
       System.out.println(L_s3);
       Executor executor = Executors.newSingleThreadExecutor(); // Creates an executor with a single thread

       executor.execute(() -> {
           System.out.println("Task is running in a separate thread!");
       });


       ((ExecutorService) executor).shutdown();//      int B=2;
//      int C=13;
//      long n=fact(A-1)%C;
//      //System.out.println("n!"+n);
//      long n_r=fact(A-B)%C;
//      //System.out.println("n-r!"+n_r);
//      long n_r_1=fact(A-B-1)%C;
//      //System.out.println("n-r-1!"+n_r_1);
//      long r_1=fact(B-1)%C;
//      //System.out.println("r-1!"+r_1);
//      long r=fact(B)%C;
//      System.out.println("r!"+r);
//      long res=(n_r*r)%C;
//      long res1=(n_r_1*r_1)%C;
//      long side1=n/res1;
//      long side2=n/res;
//      long ans=side1+side2;
//      System.out.println(ans);
//       int A=50;
//       boolean[] arr = new boolean[A+1];
//       int count=0;
//       Arrays.fill(arr,true);
//       for(long i=2;i<arr.length;i++){
//           if(arr[(int)i]){
//               count++;
//               if(i*i<=A){
//                   for(long j=i*i;j<arr.length;j=j+i){
//                       arr[(int)j]=false;
//                   }
//               }
//           }
//       }
//       arr[0]=false;
//       arr[1]=false;
//       int [] ans = new int[count];
//       int j=0;
//       for(int i=0;i<arr.length;i++){
//           if(arr[i]){
//               ans[j]=i;
//               j++;
//           }
//       }
//       for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+"  ");
//            if(i%10==0){
//                System.out.println();
//            }
//        }
//       int A=50;
//       int[] spf = new int[A+1];
//
//       for(int i=0;i<spf.length;i++){
//           spf[i]=i;
//       }
//       for(int i=2;i<spf.length;i++){
//           if(spf[i]==i){
//               for(int j=i*i;j<spf.length;j=j+i){
//                   if(spf[j]==j){
//                       spf[j]=i;
//                   }
//               }
//           }
//       }
//       ArrayList<Integer> res = new ArrayList<Integer>();
//       while(A>1){
//           int div=spf[A];
//           while(A%div==0){
//               A=A/div;
//               res.add(div);
//           }
//       }
//       System.out.println(res);
//       int[] A = {205833, 336130, 263817, 443309, 201129, 426129, 151239, 488862, 149502, 451560, 206303, 259926, 241716, 126830, 170172, 115093, 142934, 189215, 323519, 431548, 472771, 300371, 423828, 299252, 181359, 255737, 114489, 131237, 339875, 492188, 403209, 386047, 437748, 136299, 462316, 381607, 315145, 250021, 321169, 325475, 158132, 107508, 400906, 194643, 145244, 476323, 484371, 168762, 358021, 378154, 419134, 153849, 454403, 268678, 219094, 129279, 152712, 203126, 260237, 209006, 185244, 343555, 158682, 228731, 254355, 315825, 474266, 153869, 460257, 238686, 200442, 248936, 468525, 124353, 281398, 157113, 346700, 189409, 339828, 409514, 123157, 416817, 403927, 416832, 107760, 274262, 489692, 491781, 462644, 421050, 424744, 308919, 422789, 325155, 292441, 429183, 139898, 164066, 330118, 299622, 159399, 197435, 432902, 284563, 239210, 376561, 394592, 392606, 180281, 495147, 259700, 434585, 162696, 287755, 465806, 180811, 367496, 346803, 222975, 481620, 213164, 155927, 207055, 473453, 347106, 126986, 136244, 313415, 406201, 279912, 355411, 168431, 496927, 319089, 370220, 430849, 344293, 336900, 353191, 140515, 320222, 214494, 386400, 364097, 285798, 191840, 210616, 415563, 168154, 243528, 318237, 497504, 441584, 223769, 157457, 201125, 393805, 233489, 207712, 323488, 432124, 114357, 141476, 443736, 120567, 389052, 405108, 245793, 137899, 344013, 131488, 283190, 307744, 290389, 339802, 152382, 475888, 340838, 282849, 474144, 296136, 104291, 169905, 478305, 334960, 127748, 123178, 145320, 316458, 303619, 318526, 378839, 403016, 413084, 416138, 166668, 143378, 290393, 404511, 133226, 318637, 170001, 261075, 494756, 178010, 417831, 375448, 199313, 480103, 449989, 486341, 166722, 141643, 406647, 350748, 239395, 344560, 475785, 494096, 313115, 263555, 450935, 182633, 337607, 350171, 159035, 214419, 259893, 345697, 208924, 242821, 329143, 294042, 487996, 126539, 489948, 187076, 173951, 242743, 461630, 298754, 130585, 404976, 334411, 150635, 420933, 195078, 308970, 200305, 298117, 348433, 364108, 355457, 223666, 124450, 157965, 490279, 414999, 149243, 351425, 277094, 138277, 435073, 388023, 445035, 439740, 361170, 172936, 238845, 248101, 143164, 464268, 374772, 182552, 123391, 323087, 376783, 365343, 281952, 464380, 225229, 464888, 498472, 409251, 361348, 484800, 287067, 159447, 464875, 266181, 182137, 498461, 458327, 284980, 470148, 369165, 490375, 103165, 142661, 286157, 212021, 171920, 188464, 211688, 283164, 387023, 247679, 357226, 333419, 461011, 218379, 368454, 349927, 403714, 236246, 309670, 276188, 192150, 340447, 184271, 279799, 462785, 293935, 211211, 483293, 373540, 443979, 123013, 351109, 259973, 188815, 359140, 387059, 149421, 358870, 399205, 320466, 198915, 426093, 413728, 145494, 487086, 122518, 305833, 427014, 117271, 179249, 275502, 197668, 478448, 489634, 458677, 144647, 362590, 455481, 376723, 420983, 251517, 392755, 277486, 315030, 263209, 253244, 357333, 373123, 187066, 161289, 324311, 394196, 339514, 369743, 395743, 201528, 235809, 206886, 419293, 245572, 300871, 416140, 364718, 303163, 431405, 182950, 154243, 412223, 173531, 298331, 482710, 317433, 194604, 126120, 124302, 101126, 404841, 321075, 430934, 135034, 123843, 387515, 298007, 212304, 489049, 173307, 406507, 105561, 467595, 461558, 446079, 445610, 160034, 352440, 481948, 126679, 173803, 120206, 449228, 417990, 496275, 485461, 341381, 197680, 111706, 360382, 405311, 424037, 383341, 304652, 363718, 320229, 161345, 172422, 156133, 372633, 279267, 335733, 323160, 129114, 366106, 437370, 354225, 332509, 128076, 256240, 477318, 335819, 443571, 360899, 489883, 219527, 366796, 181962, 313270, 167714, 450015, 351708, 198817, 258502, 271258, 239239, 321865, 285708, 293850, 152180, 270694, 352362, 386018, 280935, 270582, 363134, 293334, 329125, 278892, 191482, 283679, 103902, 345270, 208719, 273853, 132414, 251794, 435983, 198961, 225751, 431060, 216427, 400090, 429334, 305916, 203819, 382803, 178723, 102787, 224989, 238396, 122446, 261184, 197468, 121827, 178504, 395220, 369949, 244678, 158792, 158687, 102024, 468472, 125766, 123394, 411020, 373101, 138235, 301203, 187522, 427102, 398269, 423412, 117572, 200936, 228766, 336812, 348294, 441420, 191319, 483962, 195064, 264863, 396577, 205921, 312174, 328477, 464409, 338908, 135223, 404018, 258715, 271998, 452367, 104608, 251847, 291257, 272804, 205140, 166141, 456335, 334789, 248593, 395186, 238798, 231716, 345083, 224984, 297156, 233695, 447368, 455269, 271749, 443352, 126044, 463825, 353374, 148402, 369584, 261696, 412708, 319912, 198799, 254809, 273317, 153928, 112348, 457541, 269227, 365559, 369256, 396410, 148729, 418352, 466437, 497105, 269323, 408187, 483659, 165640, 274365, 119706, 445298, 254550, 250233, 234644, 487736, 147544, 133486, 195231, 423174, 301199, 470729, 212208, 255105, 149768, 329573, 155770, 127631, 409329, 217306, 379126, 280267, 410025, 484569, 498159, 431831, 340261, 474558, 187032, 431473, 404271, 223959, 348381, 391833, 274574, 430040, 378070, 458800, 463399, 469007, 468345, 274264, 342236, 483957, 179502, 452740, 306267, 356454, 259050, 219656, 410481, 133953, 298653, 348607, 296875, 406003, 292991, 286756, 187231, 405361, 300971, 472092, 133490, 255880, 408591, 123143, 197891, 197171, 254038, 421257, 177554, 186819, 299486, 207442, 293314, 414084, 220330, 480302, 330165, 154741, 431471, 308459, 446755, 254919, 481553, 260398, 263960, 152478, 419919, 106548, 297632, 127715, 277348, 162917, 118202, 220829, 100485, 222527, 399897, 161830, 141197, 160354, 464892, 129269, 225911, 399439, 232835, 187338, 216330, 490267, 453707, 446635, 221739, 482493, 132104, 352067, 234448, 157534, 343590, 422072, 133750, 342480, 398824, 446551, 140082, 440267, 328796, 196586, 399941, 187986, 144527, 107249, 443387, 294650, 467206, 165492, 379844, 411712, 129796, 168308, 284194, 254061, 218729, 412081, 274014, 216205, 354380, 332205, 490133, 317756, 201593, 432810, 366486, 364336, 456616, 429572, 211626, 224448, 474354, 274345, 423015, 299806, 279969, 238520, 216590, 206088, 151407, 302740, 177927, 383018, 464493, 133772, 427621, 417145, 459860, 125098, 342365, 487614, 221029, 135915, 184516, 134728, 245517, 484003, 466772, 302994, 345968, 231088, 214914, 324840, 235851, 445037, 490399, 388134, 434363, 131421, 195886, 470075, 467730, 297712, 110673, 321999, 149223, 346529, 289270, 254084, 187725, 290115, 205219, 395888, 104805, 136379, 333586, 398122, 432830, 217571, 239354, 193001, 421693, 415842, 475319, 244969, 399366, 185660, 491871, 300555, 311499, 181244, 322405, 185562, 407928, 167882, 431925, 299753, 148992, 329222, 202714, 323636, 372151, 478285, 279820, 278925, 389469, 438206, 210354, 473689, 379125, 179372, 484531, 415152, 189161, 182836, 422602, 287588, 489272, 145611, 350751, 469673, 286528, 351623, 170281, 405122, 163485, 402826, 348298, 342415, 402212, 138168, 344393, 423820, 225363, 263822, 336675, 130929, 315485, 276263, 421813, 383340, 366326, 280532, 437604, 239066, 275002, 489163, 392867, 159754, 101449, 333006, 188350, 180685, 101662, 223364, 273602, 465025, 383815, 275548, 108644, 423735, 441406, 137191, 385565, 446999, 385197, 460330, 314014, 119988, 125736, 314501, 485889, 185224, 450887, 358770, 108334, 465769, 497810, 473829, 330516, 477908, 336486, 401014, 188428, 338966, 461879, 343271, 353369, 415320, 334463, 253815, 393500, 157657, 113912, 471442, 444262, 134960, 198293, 457127, 432239, 405653, 111218, 244785, 108390, 253809, 471996, 439727, 320396, 170268, 438844, 381588, 190200, 372951, 132880, 434185, 161644, 337638, 330616, 472977, 444443, 349909, 155311, 111478, 204536, 190897, 402590, 241231, 137240, 133989, 303307, 455575, 208379, 256516, 156745, 485720, 159970, 459955, 159779, 298297, 450827, 344130, 112734, 186766, 438771, 395322, 300243, 234775, 410010, 225157, 325490, 337765, 122499, 236629, 418783, 339803, 454019, 495519, 346514, 375858, 131938, 349950, 114107, 205407, 370542, 467788, 186654, 381480, 153070, 250992, 143506, 319952, 269479, 438062, 338182, 317091, 257238, 320078, 452504, 309078, 291342, 172883, 213984, 475408, 230987, 247329, 188039, 458799, 454257, 361513, 461687, 207435, 198423, 403362, 202982, 241058, 472369, 278875, 310506, 100636, 218879, 430807, 259787, 462070, 278479, 204485, 408664, 477520, 242718, 251972, 441109, 153750, 483718, 442667, 109163, 384985, 308074, 387947, 375193, 228546, 107054, 489379, 261738, 144721, 161350, 184477, 383842, 417989, 207483, 390963, 268790, 234988, 384284, 239909, 360781, 115265, 151678, 440118, 263137, 174066, 410390, 230528, 288230, 242140, 149925, 254418, 165369, 375716, 113602, 228588, 399501, 160525, 193169, 382697, 278626, 446944, 151910, 108363, 295419, 149018, 423954, 484587, 178627, 298384, 348821, 135519, 422397, 464716, 474102, 228548, 356741, 137629, 295448, 335123, 219965, 110617, 201921, 353694, 373925, 315791, 456045, 333604, 145574, 128943, 361761, 240711, 183344, 497630, 159788, 269977, 484475, 340650, 238734, 437215, 179472, 125557, 161635, 271640, 352497, 151489, 181406, 282820, 431497, 247824, 355054, 490064, 399540, 144900, 265275, 479269, 458844, 481192, 119453, 191670, 421578, 482062, 419848, 150904, 206623, 178435, 485113, 499243, 389001, 229397, 252129, 440824, 178817, 170950, 198427, 279140, 299100, 233874, 499334, 388002, 387016, 356804, 270291, 369663, 360513, 266384, 143633, 130716, 272522, 104527, 490417, 245866, 317436, 453527, 121754, 181579, 259631, 142973, 290409, 116133, 421425, 318117, 262236, 419480, 497896, 307543, 438409, 345826, 258586, 448707, 183158, 143771, 451204, 413095, 148117, 203320, 139978, 318466, 183164, 235989, 291455, 423856, 285009, 423748, 263032, 273697, 258572, 174432, 354680, 190638, 252555, 185744, 151809, 212333, 279407, 346914, 217383, 325680, 241256, 396525, 183896, 372700, 457148, 206991, 250955, 285420, 223316, 480600, 311769, 152878, 137014, 118990, 211927, 231518, 375746, 367433, 386417, 180970, 247607, 437136, 325928, 140438, 114731, 273376, 191056, 156567, 440699, 264100, 423105, 131903, 224064, 173163, 192737, 283767, 454011, 434289, 382865, 486529, 260455, 156305, 119659, 216015, 129762, 167161, 445726, 322961, 318538, 163673, 172006, 333111, 221833, 135915, 450083, 404822, 338377, 499609, 174113, 270666, 224324, 396837, 351731, 447775, 238296, 214842, 475787, 122356, 354351, 124630, 483931, 197024, 255833, 155563, 110568, 235258, 121869, 199050, 115835, 445569, 179641, 373939, 218786, 418582, 419348, 188126, 167103, 263504, 255140, 495383, 443174, 286128, 164106, 173320, 436490, 408706, 246739, 137913, 104892, 152777, 226124, 361906, 202250, 189193, 439436, 178898, 467765, 405306, 274135, 331897, 352150, 347491, 462613, 164488, 498520, 167867, 272825, 254833, 100905, 237299, 318833, 457074, 230878, 182435, 463934, 141725, 252863, 462791, 100457, 216066, 341278, 124524, 164083, 457498, 267730, 250832, 176889, 407310, 244065, 274503, 212149, 349208, 487167, 126467, 135261, 336454, 313944, 364809, 398967, 233386, 180062, 161944, 457384, 301577, 343523, 123378, 112210, 387787, 164293, 169624, 215745, 260395, 443748, 133611, 129241, 492871, 462787, 309077, 171412, 107352, 295042, 131168, 390744, 368336, 351696, 278661, 356606, 455916, 356976, 357922, 287955, 250003, 258508, 161929, 124790, 121376, 344259, 493384, 496311, 252368, 267883, 499143, 351080, 199484, 376884, 383895, 288317, 362137, 493050, 454229, 365771, 336213, 312227, 489920, 358449, 408055, 270563, 247482, 303819, 483981, 466918, 471737, 492909, 352343, 436245};
//       int max=0;
//       for(int i=0;i<A.length;i++){
//           max=Math.max(max,A[i]);
//       }
//       ArrayList<Integer>[] arr = new ArrayList[max+1];
//       for(int i=0;i<max+1;i++){
//           arr[i]=new ArrayList<>();
//       }
//
//       for(int i=2;i<arr.length;i++){
//           for(int j=0;j<arr.length;j=j+i){
//               arr[j].add(i);
//           }
//       }
//       int[] ans = new int[A.length];
//       int count=0;
//       for(int i=0;i<A.length;i++){
//           int x=A[i];
//           count=arr[A[i]].size()+1;
//           ans[i]=count;
//       }
//       for(int i=0;i<ans.length;i++){
//           System.out.print(ans[i]+"  ");
//           if(i%10==0){
//               System.out.println();
//           }
//       }
//       String s= "RLRRRLLRLL";
//       int r_count=0;
//       int l_count=0;
//       int ans=0;
//       for(int i=0;i<s.length();i=i){
//           for(int j=i;j<s.length();j++){
//               if(s.charAt(j)!='R'){
//                   break;
//               }
//               r_count++;
//           }
//           i=i+r_count;
//           if(r_count!=0 && l_count!=0){
//               if(r_count==l_count){
//                   ans++;
//                   r_count=0;
//                   l_count=0;
//               }
//           }
//           System.out.println(i+"rcount");
//           for(int j=i;j<s.length();j++){
//               if(s.charAt(j)!='L'){
//                   break;
//               }
//               l_count++;
//           }
//           i=i+l_count;
//           System.out.println(i+"lcount");
//           if(r_count!=0 && l_count!=0){
//               if(r_count==l_count){
//                   ans++;
//                   r_count=0;
//                   l_count=0;
//               }
//           }
//       }
//       String s = "codeleet";
//       int[] indices = {4,5,6,7,0,2,1,3};
//       char[] str = new char[s.length()];
//       for(int i=0;i<indices.length;i++){
//           str[indices[i]]=s.charAt(i);
//       }
//       for(int i=0;i<str.length;i++){
//           System.out.println(str[i]);
//       }
//       String ans = str.toString();
//       System.out.println(ans);
//       int A= 40;
//
//       boolean[] prime = new boolean[A+1];
//       int[] count = new int[A+1];
//
//       Arrays.fill(prime,true);
//       for(int i=2;i<A+1;i++){
//           if(prime[i]){
//               for(int j=2*i;j<A+1;j=j+i) {
//                   prime[j] = false;
//                   count[j] += 1;
//
//               }
//           }
//       }
//       prime[0]=false;
//       prime[1]=false;
//       int ans=0;
//       for(int i=0;i<A+1;i++){
//           System.out.println(i+"  "+prime[i]+"     "+count[i]);
//       }
//       int max=10;
//       int[] arr = new int[max+1];
//       for(int i=0;i<max+1;i++){
//           arr[i]=i;
//       }
//       for(int i=2;i<=arr.length;i++){
//           for(int j=i;j<arr.length;j=j+i){
//               if(arr[j]==j){
//                   arr[j]=i;
//               }
//           }
//       }
//       for(int i=0;i<max+1;i++){
//           System.out.println(arr[i]);
//       }
//       int ans=0;
//       int[] nums= {10,100};
//       int i=0;
//       int j=1;
//       while(j<nums.length){
//           int sum = nums[i]^nums[j];
//           ans=Math.max(ans,sum);
//           i++;
//           j++;
//       }
//       System.out.println(ans);
//       int max=10;
//       int[] arr = new int[max+1];
//       for(int i=0;i<max+1;i++){
//           arr[i]=i;
//       }
//       for(int i=2;i<=arr.length;i++){
//           for(int j=i;j<arr.length;j=j+i){
//               if(arr[j]==j){
//                   //System.out.print(arr[j]+"  "+j+"   "+i);
//                   arr[j]=i;
//               }
//               System.out.println();
//           }
//       }
//       for(int i:arr){
//           System.out.print(i+"  ");
//       }
//       String[] strs = {"eat","tea","tan","ate","nat","bat"};
//       ArrayList[] charArray = new ArrayList[strs.length];
//       for(int i=0;i<strs.length;i++){
//           charArray[i]=new ArrayList<>();
//       }
//       for(int i=0;i<strs.length;i++){
//           String ele = strs[i];
//           char[] st = ele.toCharArray();
//           for(int j=0;j<st.length;j++){
//               charArray[i].add(st[j]);
//           }
//       }
//
//       for(int i=0;i<charArray.length;i++){
//           Collections.sort(charArray[i]);
//       }
//       for(int i=0;i<charArray.length;i++){
//           System.out.println(charArray[i]);
//       }
//       HashMap<String,ArrayList<String>> res = new HashMap<>();
//       for(int i=0;i<charArray.length;i++){
//           String st = charArray[i].toString();
//           if(res.containsKey(st)){
//
//           }
//       }
   }
   public static long fact(int n){
      long result = 1;
      for (int i = 1; i <= n; i++) {
         result = (result * i) ;
      }
      return result;
   }
}
