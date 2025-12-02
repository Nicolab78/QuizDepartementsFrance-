package com.example.quizdepartementsfrance.data

import com.example.quizdepartementsfrance.models.Departement

object DepartementsData{

    fun getAllDepartements(): List<Departement> {
        return listOf(

            // Auvergne-Rhône-Alpes
            Departement("01", "Ain", "Auvergne-Rhône-Alpes", "Bourg-en-Bresse"),
            Departement("03", "Allier", "Auvergne-Rhône-Alpes", "Moulins"),
            Departement("07", "Ardèche", "Auvergne-Rhône-Alpes", "Privas"),
            Departement("15", "Cantal", "Auvergne-Rhône-Alpes", "Aurillac"),
            Departement("26", "Drôme", "Auvergne-Rhône-Alpes", "Valence"),
            Departement("38", "Isère", "Auvergne-Rhône-Alpes", "Grenoble"),
            Departement("42", "Loire", "Auvergne-Rhône-Alpes", "Saint-Étienne"),
            Departement("43", "Haute-Loire", "Auvergne-Rhône-Alpes", "Le Puy-en-Velay"),
            Departement("63", "Puy-de-Dôme", "Auvergne-Rhône-Alpes", "Clermont-Ferrand"),
            Departement("69", "Rhône", "Auvergne-Rhône-Alpes", "Lyon"),
            Departement("73", "Savoie", "Auvergne-Rhône-Alpes", "Chambéry"),
            Departement("74", "Haute-Savoie", "Auvergne-Rhône-Alpes", "Annecy"),

            // Bourgogne-Franche-Comté
            Departement("21", "Côte-d'Or", "Bourgogne-Franche-Comté", "Dijon"),
            Departement("25", "Doubs", "Bourgogne-Franche-Comté", "Besançon"),
            Departement("39", "Jura", "Bourgogne-Franche-Comté", "Lons-le-Saunier"),
            Departement("58", "Nièvre", "Bourgogne-Franche-Comté", "Nevers"),
            Departement("70", "Haute-Saône", "Bourgogne-Franche-Comté", "Vesoul"),
            Departement("71", "Saône-et-Loire", "Bourgogne-Franche-Comté", "Mâcon"),
            Departement("89", "Yonne", "Bourgogne-Franche-Comté", "Auxerre"),
            Departement("90", "Territoire de Belfort", "Bourgogne-Franche-Comté", "Belfort"),

            // Bretagne
            Departement("22", "Côtes-d'Armor", "Bretagne", "Saint-Brieuc"),
            Departement("29", "Finistère", "Bretagne", "Quimper"),
            Departement("35", "Ille-et-Vilaine", "Bretagne", "Rennes"),
            Departement("56", "Morbihan", "Bretagne", "Vannes"),

            // Centre-Val de Loire
            Departement("18", "Cher", "Centre-Val de Loire", "Bourges"),
            Departement("28", "Eure-et-Loir", "Centre-Val de Loire", "Chartres"),
            Departement("36", "Indre", "Centre-Val de Loire", "Châteauroux"),
            Departement("37", "Indre-et-Loire", "Centre-Val de Loire", "Tours"),
            Departement("41", "Loir-et-Cher", "Centre-Val de Loire", "Blois"),
            Departement("45", "Loiret", "Centre-Val de Loire", "Orléans"),

            // Corse
            Departement("2A", "Corse-du-Sud", "Corse", "Ajaccio"),
            Departement("2B", "Haute-Corse", "Corse", "Bastia"),

            // Grand Est
            Departement("08", "Ardennes", "Grand Est", "Charleville-Mézières"),
            Departement("10", "Aube", "Grand Est", "Troyes"),
            Departement("51", "Marne", "Grand Est", "Châlons-en-Champagne"),
            Departement("52", "Haute-Marne", "Grand Est", "Chaumont"),
            Departement("54", "Meurthe-et-Moselle", "Grand Est", "Nancy"),
            Departement("55", "Meuse", "Grand Est", "Bar-le-Duc"),
            Departement("57", "Moselle", "Grand Est", "Metz"),
            Departement("67", "Bas-Rhin", "Grand Est", "Strasbourg"),
            Departement("68", "Haut-Rhin", "Grand Est", "Colmar"),
            Departement("88", "Vosges", "Grand Est", "Épinal"),

            // Hauts-de-France
            Departement("02", "Aisne", "Hauts-de-France", "Laon"),
            Departement("59", "Nord", "Hauts-de-France", "Lille"),
            Departement("60", "Oise", "Hauts-de-France", "Beauvais"),
            Departement("62", "Pas-de-Calais", "Hauts-de-France", "Arras"),
            Departement("80", "Somme", "Hauts-de-France", "Amiens"),

            // Île-de-France
            Departement("75", "Paris", "Île-de-France", "Paris"),
            Departement("77", "Seine-et-Marne", "Île-de-France", "Melun"),
            Departement("78", "Yvelines", "Île-de-France", "Versailles"),
            Departement("91", "Essonne", "Île-de-France", "Évry-Courcouronnes"),
            Departement("92", "Hauts-de-Seine", "Île-de-France", "Nanterre"),
            Departement("93", "Seine-Saint-Denis", "Île-de-France", "Bobigny"),
            Departement("94", "Val-de-Marne", "Île-de-France", "Créteil"),
            Departement("95", "Val-d'Oise", "Île-de-France", "Cergy"),

            // Normandie
            Departement("14", "Calvados", "Normandie", "Caen"),
            Departement("27", "Eure", "Normandie", "Évreux"),
            Departement("50", "Manche", "Normandie", "Saint-Lô"),
            Departement("61", "Orne", "Normandie", "Alençon"),
            Departement("76", "Seine-Maritime", "Normandie", "Rouen"),

            // Nouvelle-Aquitaine
            Departement("16", "Charente", "Nouvelle-Aquitaine", "Angoulême"),
            Departement("17", "Charente-Maritime", "Nouvelle-Aquitaine", "La Rochelle"),
            Departement("19", "Corrèze", "Nouvelle-Aquitaine", "Tulle"),
            Departement("23", "Creuse", "Nouvelle-Aquitaine", "Guéret"),
            Departement("24", "Dordogne", "Nouvelle-Aquitaine", "Périgueux"),
            Departement("33", "Gironde", "Nouvelle-Aquitaine", "Bordeaux"),
            Departement("40", "Landes", "Nouvelle-Aquitaine", "Mont-de-Marsan"),
            Departement("47", "Lot-et-Garonne", "Nouvelle-Aquitaine", "Agen"),
            Departement("64", "Pyrénées-Atlantiques", "Nouvelle-Aquitaine", "Pau"),
            Departement("79", "Deux-Sèvres", "Nouvelle-Aquitaine", "Niort"),
            Departement("86", "Vienne", "Nouvelle-Aquitaine", "Poitiers"),
            Departement("87", "Haute-Vienne", "Nouvelle-Aquitaine", "Limoges"),

            // Occitanie
            Departement("09", "Ariège", "Occitanie", "Foix"),
            Departement("11", "Aude", "Occitanie", "Carcassonne"),
            Departement("12", "Aveyron", "Occitanie", "Rodez"),
            Departement("30", "Gard", "Occitanie", "Nîmes"),
            Departement("31", "Haute-Garonne", "Occitanie", "Toulouse"),
            Departement("32", "Gers", "Occitanie", "Auch"),
            Departement("34", "Hérault", "Occitanie", "Montpellier"),
            Departement("46", "Lot", "Occitanie", "Cahors"),
            Departement("48", "Lozère", "Occitanie", "Mende"),
            Departement("65", "Hautes-Pyrénées", "Occitanie", "Tarbes"),
            Departement("66", "Pyrénées-Orientales", "Occitanie", "Perpignan"),
            Departement("81", "Tarn", "Occitanie", "Albi"),
            Departement("82", "Tarn-et-Garonne", "Occitanie", "Montauban"),

            // Pays de la Loire
            Departement("44", "Loire-Atlantique", "Pays de la Loire", "Nantes"),
            Departement("49", "Maine-et-Loire", "Pays de la Loire", "Angers"),
            Departement("53", "Mayenne", "Pays de la Loire", "Laval"),
            Departement("72", "Sarthe", "Pays de la Loire", "Le Mans"),
            Departement("85", "Vendée", "Pays de la Loire", "La Roche-sur-Yon"),

            // Provence-Alpes-Côte d'Azur
            Departement("04", "Alpes-de-Haute-Provence", "Provence-Alpes-Côte d'Azur", "Digne-les-Bains"),
            Departement("05", "Hautes-Alpes", "Provence-Alpes-Côte d'Azur", "Gap"),
            Departement("06", "Alpes-Maritimes", "Provence-Alpes-Côte d'Azur", "Nice"),
            Departement("13", "Bouches-du-Rhône", "Provence-Alpes-Côte d'Azur", "Marseille"),
            Departement("83", "Var", "Provence-Alpes-Côte d'Azur", "Toulon"),
            Departement("84", "Vaucluse", "Provence-Alpes-Côte d'Azur", "Avignon"),

            // Départements d'Outre-Mer
            Departement("971", "Guadeloupe", "Guadeloupe", "Basse-Terre"),
            Departement("972", "Martinique", "Martinique", "Fort-de-France"),
            Departement("973", "Guyane", "Guyane", "Cayenne"),
            Departement("974", "La Réunion", "La Réunion", "Saint-Denis"),
            Departement("976", "Mayotte", "Mayotte", "Mamoudzou")

        )
    }
}