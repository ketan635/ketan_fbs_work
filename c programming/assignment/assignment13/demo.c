#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct Player {
    int jerseyNumber;
    char name[50];
    int runs;
    int wickets;
    int matches;
} Player;
void main()
player play=[100];
for(int i=0;i<100;i++)
void addPlayer(&play[i]);
void removePlayer(&play[i]);
void searchPlayer(&play[i]);
void updatePlayer(&play[i]);
void displayAllPlayers(&play[i]);
void displaySortedPlayers(&play[i]);
void displayTopPlayers(&play[i]);
void sortByRuns(int ascending);
void sortByWickets(int ascending);
int main() {
    int choice;

    do {
        printf("\n--- Player Management System ---\n");
        printf("1. Add Player\n");
        printf("2. Remove Player\n");
        printf("3. Search Player\n");
        printf("4. Update Player Data\n");
        printf("5. Display All Players\n");
        printf("6. Display Sorted Players\n");
        printf("7. Display Top 3 Players (Runs & Wickets)\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);