#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *replaceAll(char *s, const char *olds, const char *news);

int main() {
	char str[] = "��������� ����б�";
	char *str2;

	printf("����: %s\n", str);

	str2 = replaceAll(str, "���", "�ߵ�");

	// ������ ������ NULL �� ����. ������ ������ ��� ���
	(str2 != NULL) ? printf("ġȯ: %s\n", str2) : fputs("Replace String Error...\n", stderr);
}




char *replaceAll(char *s, const char *olds, const char *news) {
	char *result, *sr;
	size_t i, count = 0;
	size_t oldlen = strlen(olds); if (oldlen < 1) return s;
	size_t newlen = strlen(news);


	if (newlen != oldlen) {
		for (i = 0; s[i] != '\0';) {
			if (memcmp(&s[i], olds, oldlen) == 0) count++, i += oldlen;
			else i++;
		}
	}
	else i = strlen(s);


	result = (char *)malloc(i + 1 + count * (newlen - oldlen));
	if (result == NULL) return NULL;


	sr = result;
	while (*s) {
		if (memcmp(s, olds, oldlen) == 0) {
			memcpy(sr, news, newlen);
			sr += newlen;
			s += oldlen;
		}
		else *sr++ = *s++;
	}
	*sr = '\0';

	return result;
}