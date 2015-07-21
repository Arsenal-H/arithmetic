package arithmetic;

public class Queen

{
	static final int QUEEN_MAX = 8;	// �ʺ������
	int[][] Queencount = new int[QUEEN_MAX][QUEEN_MAX];	// ����8X8�����飬�䵱���̣���Żʺ�
	int resultCount = 0;	// ��¼�ʺ�ķ��÷���������
	int[] Queenplace = new int[QUEEN_MAX];	// ���ÿ�еĻʺ�λ�ü���column�еĻʺ����λ����Queenplace[column]

	public void putQueen(int Rows)
	{
		int row = Rows;	// �б�
		for (int column = 0; column < QUEEN_MAX; column++)	// column��ʾ�б�
		{
			if (Queencount[row][column] == 0)	// row�С�column�п��ԷŻʺ�
			{
				for (int rowi = row + 1; rowi < QUEEN_MAX; rowi++)	// forѭ����������ʹ��б�·������·���Ϊ0
				{
					Queencount[rowi][column]++;
					if (column - rowi + row >= 0)
					{
						Queencount[rowi][column - rowi + row]++;
					}
					if (column + rowi - row < QUEEN_MAX)
					{
						Queencount[rowi][column + rowi - row]++;
					}
				} //
				Queenplace[row] = column;	// row��column�з��˻ʺ�
				if (row == QUEEN_MAX - 1)	// �ʺ��ѷ�������ӡ���ʺ󲼾�
				{
					printQueen(++resultCount);
				}
				else // �������������һ�лʺ�
				{
					putQueen(row + 1);
				}
				for (int rows = row + 1; rows < QUEEN_MAX; rows++)// ���ݣ��ڴ��еĻʺ󲻷Ŵ���column
				{
					Queencount[rows][column]--;
					if (column - rows + row >= 0)
					{
						Queencount[rows][column - rows + row]--;
					}
					if (column + rows - row < QUEEN_MAX)
					{
						Queencount[rows][column + rows - row]--;
					}
				}
			}
		}
		if (row == 0)
		{
			System.out.println(QUEEN_MAX + "�ʺ����⹲��" + resultCount + "����.");
		}
	}

	public void printQueen(int size)// ��ӡ�ʺ󲼾�
	{
		System.out.println(QUEEN_MAX + "�ʺ�ĵ�" + size + "������:");
		System.out.println();
		for (int row = 0; row < QUEEN_MAX; row++)
		{
			for (int column = 0; column < QUEEN_MAX; column++)
			{
				System.out.print(Queenplace[row] == column ? " * " : " - ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Queen Q = new Queen();
		Q.putQueen(0);
	}
}

