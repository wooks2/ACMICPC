#include <iostream>
using namespace std;

int main(void)
{
	int x_in, y_in;
	int x_out, y_out;

	x_in = y_in = 0;
	x_out = y_out = 0;
	for (int i = 0; i < 3; i++)
	{
		cin >> x_in >> y_in;
		x_out ^= x_in;
		y_out ^= y_in;
	}
	cout << x_out << " " << y_out;
	return 0;
	
}