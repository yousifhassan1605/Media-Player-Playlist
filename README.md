# Media Player Playlist

A Java-based media player application that manages playlists using data structures like ArrayList and HashMap.

## Overview

This project implements a media management system with playlist functionality. It demonstrates fundamental data structure concepts including dynamic arrays, hash maps, and object-oriented programming in Java.

## Features

- **Media Management**: Create and manage media items with title, genre, rating, and duration
- **Playlist Operations**:
  - Add media to playlist
  - Remove media by title
  - Play next item (removes from queue)
  - Check if playlist contains specific media
  - Display playlist contents
  - Get playlist size
- **Advanced Features**:
  - Shuffle playlist randomly
  - Track play counts using HashMap
  - Sort and retrieve top-rated media
  - Prevent duplicate entries

## Project Structure

```
Media-Player-Playlist/
├── src/
│   ├── module-info.java
│   └── datastructure/
│       ├── Main.java           # Entry point with demo
│       ├── Media.java          # Media class definition
│       ├── Playlist.java       # Playlist implementation
│       └── MediaPlayerTest.java # Test cases
└── bin/
    └── datastructure/          # Compiled classes
```

## Classes

### Media

Represents a media item with the following properties:

- `title`: Name of the media
- `genre`: Category/genre
- `rating`: User rating
- `duration`: Length of media (using Java Duration)

Key methods:

- `getTopFiveRated()`: Returns top 5 rated media items
- Static collection to track all media instances

### Playlist

Manages a collection of media items using ArrayList.

Key methods:

- `addMedia(Media)`: Adds media to the end of playlist
- `removeMedia(String)`: Removes first occurrence of media by title
- `playNext()`: Plays and removes the first item in queue
- `showPlaylist()`: Displays all media in playlist
- `getSize()`: Returns number of items
- `containsMedia(String)`: Checks if media exists in playlist
- `shufflePlaylist()`: Randomizes playlist order
- `showPlayCounts()`: Displays frequency of each media title

## How to Run

### Compile

```bash
javac -d bin src/datastructure/*.java
```

### Run

```bash
java -cp bin datastructure.Main
```

## Example Output

```
Playlist after adding items:
Media [Title=Inception, Genre=null, Rating=0.0, Duration=2h 28m]
Media [Title=Interstellar, Genre=null, Rating=0.0, Duration=2h 49m]
Media [Title=The Dark Knight, Genre=null, Rating=0.0, Duration=2h 32m]
Media [Title=Inception, Genre=null, Rating=0.0, Duration=2h 28m]

Size: 4

Playlist after removing Inception:
Media [Title=Interstellar, Genre=null, Rating=0.0, Duration=2h 49m]
Media [Title=The Dark Knight, Genre=null, Rating=0.0, Duration=2h 32m]
Media [Title=Inception, Genre=null, Rating=0.0, Duration=2h 28m]

Playing Next:
Now playing.. Interstellar

Does the playlist contain 'The Dark Knight'? true

Play Counts:
"The Dark Knight" => 3 "Interstellar" => 1 
```

## Requirements

- Java 9 or higher (uses `Duration.toMinutesPart()`)
- No external dependencies

## Data Structures Used

- **ArrayList**: For maintaining ordered collection of media items in playlists
- **HashMap**: For counting frequency of media titles
- **Static List**: For tracking all media instances globally

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
