import java.util.Arrays;  //陪 切疑生稽 蓄亜背 捜
/*2016. 03. 04*/
public class ArrayTest {
	int[] intArray2 = null;
	
	public static void main(String[] args) {
		char[] c = new char[3];
		c[0] = 'B';
		c[1] = 'I';
		c[2] = 'T';
		
		System.out.println(c.length);
		System.out.println(c);
		//壕伸 梓端税 凧繕葵
		System.out.println(System.identityHashCode(c));
		
		String s = new String("hello");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		
		//壕伸税 識情
		int[] intArray = null;
		int[] intArray3 = new int[20];
		int[] intArray4 = { 0, 1, 2, 3, 4, 5};
		int[] intArray5;
		//intArray5 = {10, 20, 30, 40};  識情引 疑獣拭 段奄鉢澗 亜管馬走幻 戚係惟澗 照吉陥!!
		
		//壕伸  Out Of Bound 森須
		/*try {
			intArray2[10] = 10;
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index out of Bound Error");
		}*/
		
	/*	切! 森薦拭辞
		Student[] sArray = new Student[5];
		梓端澗 new Student(); 背操醤 持奄澗 暗心走??
		益訓汽 new Student[5]拭辞澗 益撹 5鯵 幻級畏陥壱 剰奄幻 背層暗壱 
		焼掘拭辞 馬蟹梢 歯稽 幻級嬢操醤 背!!!@@@ 嬢薦 Practice 2税 坪球研 亜閃人 瑳猿?
		Goods[] goods = new Goods[3];
		for(i=0; i<3; i++) {
			goods[i] = new Goods();
		}
		推係惟 処醸柔艦陥~~
		*/
		//郊菓 砺原 硝系含系 格巷 森蚕 神潅精 獄什照拭辞 持唖亀 梅壱 焼徴採斗 岨 重貝雁
		//Array utility class 紫遂
		//int[] intArray6 = {20, 30, 10, 20, 1, 9};
		//int index = Arrays.binarySearch(intArray6, 20);
		//澗.... 益撹 馬形 梅希艦 社特戚 照鞠辞 公廃陥壱.......ぞぞぞぞぞぞぞぞ 社特敗呪亀 魚稽 赤陥走幻 袷 敗
		//戚依戚 binarySearch税 舘繊汽什革~
		int[] intArray6 = {1,9,10, 20, 20, 30};
		int index = Arrays.binarySearch(intArray6, 20);
		System.out.println("戚遭 伊事 衣引 : " + index);  //4亜 窒径吉陥.
		
		//Sorting
		int[] intArray7 = {100, 20, 1500, 20, 1, 5, 6};
		Arrays.sort(intArray7);  //sorting~~~~
		//*******************************************************************************
		System.out.println(Arrays.toString(intArray7));
		//soString : 梓端税 須採 妊薄聖 是背 梓端研 庚切伸稽 痕発馬澗 依
		
		//static拭 企背 - static敗呪澗 梓端稽 羨悦馬走 省壱  class 戚硯生稽 羨悦敗.
		//main亀 java亜 梓端研 幻級走 省製. class戚硯.main生稽 羨悦敗.
		//戚訓 適掘什亜  utility class虞壱....
		
		//System.out. 拭澗 println(int[])澗 蒸嬢.... char澗 赤澗汽 int澗 蒸嬢....
		//企重 object研 閤澗 蕉亜 戚初.
		
		int[] intArray8 = {1, 5, 6, 20, 100, 1500};
		boolean b = Arrays.equals(intArray7, intArray8);
		System.out.println(b);
		
		
		Arrays.fill(intArray8, -10);
		System.out.println(Arrays.toString(intArray8));  //陥 辰趨獄携生....
		
		//壕伸 差紫
		int[] src = {10, 20, 30, 40, 50};
		int[] dest1 = src;  //旭精 壕伸 梓端 凧繕.
		System.out.println(Arrays.toString(dest1));
		int[] dest2 = new int[src.length];
		System.out.println(Arrays.toString(dest2));
		
		//MyArrayUtil 砺什闘 背左奄
		boolean b2 = ArrayUtil.equals(src, dest1);
		System.out.println(b2);
		
		
	}

}
