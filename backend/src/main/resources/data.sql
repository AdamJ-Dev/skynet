INSERT INTO channel (id, name, description, colour)
VALUES
  (1, 'Skynet News', 'The Skynet News channel provides the latest news, reports, and analysis from around the world.', '#1841E7'),
  (2, 'Skynet Drama', 'The Skynet Drama channel showcases a range of classic and contemporary drama series and movies.', '#1DBC09'),
  (3, 'Skynet Comedy', 'The Skynet Comedy channel features hilarious sitcoms, stand-up comedy, and comedic movies.', '#F4511E'),
  (4, 'Skynet Cinema', 'The Skynet Cinema channel offers a selection of acclaimed films from various genres.', '#642424'),
  (5, 'Skynet Thriller', 'The Skynet Thriller channel broadcasts suspenseful and exciting thriller films.', '#62639D'),
  (6, 'Skynet Reality', 'The Skynet Reality channel airs popular reality TV shows, ranging from cooking competitions to talent hunts.', '#B44BA0'),
  (7, 'Skynet Sports', 'The Skynet Sports channel covers a variety of sports events, news, and documentaries.', '#0C4F07');



INSERT INTO programme (id, title, description, since, till, channel_id)
VALUES
  (1, 'Morning News', 'Latest updates from around the world.', '2023-08-04T09:00:00', '2023-08-04T12:00:00', 1),
  (2, 'Afternoon News', 'Updates on global events.', '2023-08-04T12:00:00', '2023-08-04T17:00:00', 1),
  (3, 'Evening News', 'News wrap-up of the day''s events.', '2023-08-04T17:00:00', '2023-08-04T20:00:00', 1),
  (4, 'Late Night News', 'News and updates into the night.', '2023-08-04T20:00:00', '2023-08-04T21:00:00', 1),
  (5, 'Breaking Bad', 'A high school chemistry teacher turned methamphetamine manufacturing drug dealer.', '2023-08-04T09:00:00', '2023-08-04T10:30:00', 2),
  (6, 'Game of Thrones', 'Epic fantasy drama based on George R. R. Martin''s novel series.', '2023-08-04T10:30:00', '2023-08-04T12:00:00', 2),
  (7, 'The Crown', 'Chronicles the reign of Queen Elizabeth II.', '2023-08-04T12:00:00', '2023-08-04T13:00:00', 2),
  (8, 'The Walking Dead', 'Post-apocalyptic horror television series based on the comic book.', '2023-08-04T13:00:00', '2023-08-04T15:00:00', 2),
  (9, 'The Sopranos', 'New Jersey mob boss, Tony Soprano, deals with personal and professional issues.', '2023-08-04T15:00:00', '2023-08-04T16:45:00', 2),
  (10, 'The Wire', 'Baltimore drug scene, seen through the eyes of drug dealers and law enforcement.', '2023-08-04T16:45:00', '2023-08-04T18:00:00', 2),
  (11, 'Downton Abbey', 'A chronicle of the lives of the British aristocratic Crawley family.', '2023-08-04T18:00:00', '2023-08-04T19:30:00', 2),
  (12, 'Peaky Blinders', 'A gangster family epic set in 1900s England, centering on a gang who sew razor blades in the peaks of their caps.', '2023-08-04T19:30:00', '2023-08-04T21:00:00', 2),
  (13, 'The Office', 'A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium.', '2023-08-04T09:00:00', '2023-08-04T12:00:00', 3),
  (14, 'Parks and Recreation', 'The absurd antics of an Indiana town''s public officials as they pursue sundry projects to make their city a better place.', '2023-08-04T12:00:00', '2023-08-04T12:45:00', 3),
  (15, 'Friends', 'Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan.', '2023-08-04T12:45:00', '2023-08-04T13:30:00', 3),
  (16, 'Brooklyn Nine-Nine', 'Comedy series following the detectives of Brooklyn''s 99th Precinct.', '2023-08-04T13:30:00', '2023-08-04T15:00:00', 3),
  (17, 'The Simpsons', 'The satiric adventures of a working-class family in the misfit city of Springfield.', '2023-08-04T18:00:00', '2023-08-04T19:30:00', 3),
  (18, 'The Big Bang Theory', 'A woman who moves into an apartment across the hall from two brilliant but socially awkward physicists shows them how little they know about life outside of the laboratory.', '2023-08-04T16:30:00', '2023-08-04T18:00:00', 3),
  (19, 'The Simpsons', 'The satiric adventures of a working-class family in the misfit city of Springfield.', '2023-08-04T15:00:00', '2023-08-04T16:30:00', 3),
  (20, 'Arrested Development', 'Level-headed son Michael Bluth takes over family affairs after his father is imprisoned. But the rest of his spoiled, dysfunctional family are making his job unbearable.', '2023-08-04T19:30:00', '2023-08-04T21:00:00', 3),
  (21, 'Jaws', 'A local sheriff, a marine biologist and an old seafarer team up to hunt down a great white shark wrecking havoc in a beach resort.', '2023-08-04T09:00:00', '2023-08-04T11:15:00', 4),
  (22, 'Jurassic Park', 'During a preview tour, a theme park suffers a major power breakdown that allows its cloned dinosaur exhibits to run amok.', '2023-08-04T11:15:00', '2023-08-04T13:45:00', 4),
  (23, 'The Sound of Music', 'A woman leaves an Austrian convent to become a governess to the children of a Naval officer widower.', '2023-08-04T13:45:00', '2023-08-04T16:45:00', 4),
  (24, 'E.T. the Extra-Terrestrial', 'A troubled child summons the courage to help a friendly alien escape Earth and return to his home world.', '2023-08-04T16:45:00', '2023-08-04T18:30:00', 4),
  (25, 'Star Wars: Return of the Jedi', 'After a daring mission to rescue Han Solo from Jabba the Hutt, the Rebels dispatch to Endor to destroy the second Death Star.', '2023-08-04T18:30:00', '2023-08-04T21:00:00', 4),
  (26, 'Seven', 'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.', '2023-08-04T09:00:00', '2023-08-04T11:00:00', 5),
  (27, 'The Silence of the Lambs', 'A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer.', '2023-08-04T11:00:00', '2023-08-04T14:00:00', 5),
  (28, 'The Shining', 'A family heads to an isolated hotel for the winter where a sinister presence influences the father into violence.', '2023-08-04T14:00:00', '2023-08-04T15:45:00', 5),
  (29, 'Fight Club', 'An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much more.', '2023-08-04T15:45:00', '2023-08-04T17:15:00', 5),
  (30, 'The Beach', 'Vicenarian Richard travels to Thailand and finds himself in possession of a strange map. Rumours state that it leads to a solitary beach paradise, a tropical bliss.', '2023-08-04T17:15:00', '2023-08-04T19:15:00', 5),
  (31, 'Gone Girl', 'With his wife''s disappearance having become the focus of an intense media circus, a man sees the spotlight turned on him when it''s suspected that he may not be innocent.', '2023-08-04T19:15:00', '2023-08-04T21:00:00', 5),
  (32, 'MasterChef', 'Amateur chefs compete in this reality cooking competition, judged by world-renowned chefs.', '2023-08-04T09:00:00', '2023-08-04T10:00:00', 6),
  (33, 'The Amazing Race', 'Teams of two people race around the world in competition with other teams.', '2023-08-04T10:00:00', '2023-08-04T11:00:00', 6),
  (34, 'Love Island', 'A dating show where singles live in a villa and compete for love and money.', '2023-08-04T11:00:00', '2023-08-04T12:15:00', 6),
  (35, 'Survivor', 'Contestants are stranded on a remote island and must outwit, outlast and outplay each other for the title of Sole Survivor.', '2023-08-04T12:15:00', '2023-08-04T13:00:00', 6),
  (36, 'The Real Housewives of Beverly Hills', 'An up-close look at the lives of wealthy and famous women in Beverly Hills.', '2023-08-04T13:00:00', '2023-08-04T14:00:00', 6),
  (37, 'Big Brother', 'Contestants live together in a house and are filmed 24/7, with weekly evictions deciding the winner.', '2023-08-04T14:00:00', '2023-08-04T15:30:00', 6),
  (38, 'The Bachelor', 'A single bachelor dates multiple women over several weeks, narrowing them down in hopes of finding his true love.', '2023-08-04T15:30:00', '2023-08-04T16:00:00', 6),
  (39, 'Dancing With the Stars', 'Celebrities partner up with professional dancers and compete in a dance competition.', '2023-08-04T16:00:00', '2023-08-04T17:00:00', 6),
  (40, 'Hell''s Kitchen', 'Aspiring chefs brave Chef Gordon Ramsay and his fiery command of the kitchen in an intense culinary academy.', '2023-08-04T17:00:00', '2023-08-04T18:00:00', 6),
  (41, 'America''s Got Talent', 'Performers of all kinds showcase their talent and compete against each other for a chance to win a cash prize.', '2023-08-04T18:00:00', '2023-08-04T20:00:00', 6),
  (42, 'The Voice', 'Talented singers compete in blind auditions for a chance to be mentored by industry professionals and win a recording contract.', '2023-08-04T20:00:00', '2023-08-04T21:00:00', 6),
  (43, 'SportsCenter', 'Catch up on the biggest stories from the world of sports in this comprehensive roundup.', '2023-08-04T09:00:00', '2023-08-04T10:30:00', 7),
  (44, '2023 FIFA Women''s World Cup Qualifiers', 'Watch teams from across the globe compete for a spot in the 2023 FIFA Women''s World Cup.', '2023-08-04T10:30:00', '2023-08-04T12:45:00', 7),
  (45, 'The Wimbledon Finals: A Look Back', 'A detailed look at some of the most thrilling finals in the history of the Wimbledon Championships.', '2023-08-04T12:45:00', '2023-08-04T14:15:00', 7),
  (46, 'NBA: The Greatest Games', 'Revisit some of the most memorable games in the history of the NBA.', '2023-08-04T14:15:00', '2023-08-04T16:00:00', 7),
  (47, 'The Open Championship Highlights', 'Highlights from the latest Open Championship, one of the most prestigious tournaments in golf.', '2023-08-04T16:00:00', '2023-08-04T18:15:00', 7),
  (48, 'Sports Documentaries: The Rise and Fall of Lance Armstrong', 'A deep dive into the rise and fall of Lance Armstrong, a seven-time Tour de France winner who was later banned for life for doping.', '2023-08-04T18:15:00', '2023-08-04T20:30:00', 7),
  (49, 'Live: Major League Baseball', 'Live coverage of today''s Major League Baseball game.', '2023-08-04T20:30:00', '2023-08-04T21:00:00', 7);

INSERT INTO location (location_id, lat, lon, programme_id, name, relationship)
VALUES
  (1, 54.5973, -5.9301, 6, 'Belfast, Northern Ireland', 'A large portion of Game of Thrones was filmed in Northern Ireland, including scenes featuring Winterfell, the Iron Islands, and more.'),
  (2, 40.7128, -74.006, 15, 'New York, New York, USA', 'New York is the backdrop of Friends, where the characters live and work. Central Perk, their favorite coffee shop, and their apartments have become iconic settings.'),
  (3, 44.0462, -123.0226, 17, 'Springfield, Oregon, USA', 'The Simpson family lives in the town of Springfield. While the exact state is intentionally left ambiguous in the show, Springfield is the center of countless adventures in the series.'),
  (4, 33.749, -84.388, 8, 'Atlanta, Georgia, USA', 'The Walking Dead begins in Atlanta, and the city serves as a key location in the early seasons of the show.'),
  (5, 40.3772, -105.5217, 28, 'Estes Park, Colorado, USA', 'The Overlook Hotel in The Shining is inspired by The Stanley Hotel in Estes Park, which author Stephen King visited and found eerie.'),
  (6, 47.8095, 13.055, 23, 'Salzburg, Austria', 'Salzburg is where the real Von Trapp family lived, and many scenes of the film were shot at iconic locations throughout the city.'),
  (7, 41.2132, -124.0046, 25, 'Redwood National and State Parks, California, USA', 'The Battle of Endor scenes, where the Rebel Alliance fights against the Galactic Empire on the forest moon of Endor, were filmed in the Redwoods of California.'),
  (8, 7.7461, 98.7784, 30, 'Phi Phi Islands, Thailand', 'The idyllic beach scenes from The Beach were filmed on the Phi Phi Islands in Thailand, contributing to the film''s allure and the islands'' subsequent tourist boom.'),
  (9, 39.6953, 3.0176, 34, 'Mallorca, Spain', 'Love Island is typically filmed in a villa in Mallorca, where the contestants live, date, and compete for the prize.');