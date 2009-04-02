#ifndef SERIALIZE_H_
#define SERIALIZE_H_
#include "DPlaya.h"

#define MAP_ROWS 17
#define MAP_COLS 18

/* player stuff */
int serialize_player(DPlaya *player, char *buf, size_t buflen);
int unserialize_player(char *buf, DPlaya *player);
/* end player stuff */

/* map stuff */
int serialize_map(char map[MAP_ROWS][MAP_COLS], char *serialized_form);
int unserialize_map(char *serialized_form, char map[MAP_ROWS][MAP_COLS]);
/* end map stuff */


#endif
