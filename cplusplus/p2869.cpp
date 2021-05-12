#include <iostream>
using namespace std;

int main(void)
{
	ios::sync_with_stdio(false);
	int A = 0;
	int B = 0;
	int V = 0;
	int nResult = 0;
	int d = 0;
	cin >> A >> B >> V;

	if ((V - A) % (A - B))
		nResult = (V - A) / (A - B) + 2;
	else
		nResult = (V - A) / (A - B) + 1;
	cout << nResult;
	return 0;
}