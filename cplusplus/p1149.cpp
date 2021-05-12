#include <iostream>
using namespace std;
int** g_pCost = nullptr;

int CalCost(int** pCost, int n, int house)
{
	
}
int main(void)
{
	int N = 0;
	int nCost = 0;
	

	cin >> N;
	g_pCost = new int*[N];
	for (int i = 0; i < N; i++)
		g_pCost[i] = new int[3]{ 0, };

	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			cin >> nCost;
			g_pCost[i][j] = nCost;
		}
	}

	
	return 0;
}