#include <iostream>
using namespace std;

int main(void)
{
	int x, y, w, h;
	int nResult = 0;
	int x_least = 0;
	int y_least = 0;
	x = y = w = h = 0;

	cin >> x >> y >> w >> h;

	x_least = w - x <= x ? w - x : x;
	y_least = h - y <= y ? h - y : y;

	nResult = x_least < y_least ? x_least : y_least;
	cout << nResult;
	return 0;
}