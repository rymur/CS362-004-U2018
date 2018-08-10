#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <time.h>
#include "dominion.h"

void randomlyGenerateGameState(struct gameState* G) {
	// Set number of players
	int numPlayers = rand() % (MAX_PLAYERS + 1 - 2) + 2;
	if (numPlayers < 2) {
		numPlayers = 2;
	}
	
	// Randomly choose the set of kingdom cards
	int randomCards[treasureMap];
	for (int i = 0; i < treasureMap; i++) {
		int randIdx = rand() % (treasureMap - i) + i;
		int tmp = randomCard[randIdx];
		randomCards[randIdx] = randomCards[i];
		randomCards[i] = tmp;
	}
	int kingdomCards[10];
	for (int i = 0; i < 10; i++) {
		kingdomCards[i] = randomCards[i]
	}

	initializeGame(numPlayers, kingdomCards, rand(), G);
}

void randomTestAdventurer() {
	struct gameState G;
	randomlyGenerateGameState(&G);
}

int main() {
	srand(time(0));
	randomTestAdventurer();
	return 0;
}