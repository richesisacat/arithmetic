package pre.demo.other;

public class BitMap {

  private static final int _1MB = 1024 * 1024;

  private static byte[] flags = new byte[512 * _1MB];

  public static void main(String[] args) {

    int[] array = {255, 255, 0, 65536, 1024};

    int index = 0;
    for (int num : array) {
      if (getFlags(num) == 0) {
        //未出现的元素
        array[index] = num;
        index = index + 1;
        //设置标志位
        setFlags(num);
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void setFlags(int num) {
    flags[num >> 3] |= 0x01 << (num & (0x07));
  }

  /**
   * <p>一个数组元素可以存储8个状态位，</p>
   *
   * <p>那将待查询的数字除以8，定位到对应的数组元素（桶），</p>
   *
   * <p>然后再求余（%8），就可以定位到相应的状态位。</p>
   *
   * <p>如果为1，则代表改数字存在；0，该数字不存在</p>
   */
  public static int getFlags(int num) {
    return flags[num >> 3] >> (num & (0x07)) & 0x01;
  }
}
