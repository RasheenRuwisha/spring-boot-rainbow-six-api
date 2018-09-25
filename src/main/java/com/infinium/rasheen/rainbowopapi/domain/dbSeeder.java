//package com.infinium.rasheen.rainbowopapi.domain;
//
//import com.infinium.rasheen.rainbowopapi.Repository.OperatorListRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class dbSeeder  implements CommandLineRunner {
//
//    private OperatorListRepository operatorListRepository;
//
//    public dbSeeder(OperatorListRepository operatorListRepository) {
//        this.operatorListRepository = operatorListRepository;
//
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        OperatorList one = new OperatorList(1, "Kapkan","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-kapkan_317273.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-kapkan_229866.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList two = new OperatorList(2, "Tachanka","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-tachanka_317282.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-tachanka_229876.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList three = new OperatorList(3, "Glaz","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-glaz_317268.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-glaz_229859.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList four = new OperatorList(4, "Fuze","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-fuze_317267.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-fuze_229856.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList five = new OperatorList(5, "IQ","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-iq_317270.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-iq_229861.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList six = new OperatorList(6, "Blitz","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-blitz_317256.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-blitz_229849.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList seven = new OperatorList(7, "Bandit","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-bandit_317254.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-bandit_229848.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList eight = new OperatorList(8, "Jager","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-jager_317272.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-jager_229864.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList nine = new OperatorList(9, "Rook","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-rook_317279.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-rook_229872.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList ten = new OperatorList(10, "Doc", "Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-doc_317262.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-doc_229853.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList eleven = new OperatorList(11, "Twitch","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-twitch_317285.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-twitch_229879.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twelve = new OperatorList(12, "Montagne","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-montagne_317276.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-montagne_229868.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirteen = new OperatorList(13, "Thermite","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-thermite_317284.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-thermite_229878.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList fourteen = new OperatorList(14, "Pulse","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-pulse_317278.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-pulse_229871.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList fifteen = new OperatorList(15, "Castle","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-castle_317260.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-castle_229852.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList sixteen = new OperatorList(16, "Ash","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-ash_317253.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-ash_229847.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList seventeen = new OperatorList(17, "Thatcher","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-thatcher_317283.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-thatcher_229877.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList eightteen = new OperatorList(18, "Smoke","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-smoke_317281.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-smoke_229874.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//        ;
//
//        OperatorList nineteen = new OperatorList(19, "Sledge","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-sledge_317280.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-sledge_229873.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twenty = new OperatorList(20, "Mute","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-mute_317277.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operators-badge-mute_229870.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentyone = new OperatorList(21, "Frost","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-frost_317266.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-frost_237595.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentytwo = new OperatorList(22, "Buck","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-buck_317257.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-buck_237592.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentythree = new OperatorList(23, "Valkyrie","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-valkyrie_317286.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-valkyrie_250313.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentyfour = new OperatorList(24, "BlackBeard","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-blackbeard_317255.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-blackbeard_250312.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentyfive = new OperatorList(25, "Capitao","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-capitao_317258.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-capitao_263100.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentysix = new OperatorList(26, "Caveira","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-caveira_317261.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-caveira_263102.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentyseven = new OperatorList(27, "Echo","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-echo_317264.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-echo_275572.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentyeight = new OperatorList(28, "Hibana", "Atk","https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-hibana_317269.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-hibana_275569.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList twentynine = new OperatorList(29, "Jackal","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-jackal_317271.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-velvet-shell-badge-jackal_282825.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirty = new OperatorList(30, "Mira","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-mira_317275.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-velvet-shell-badge-mira_282826.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtyone = new OperatorList(31, "Lesion","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-lesion_317274.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-blood-orchid-badge-lesion_298982.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtytwo = new OperatorList(32, "Ying","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-ying_317288.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-blood-orchid-badge-ying_298983.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtythree = new OperatorList(33, "Ela","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-ela_317265.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-ela_301983.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtyfour = new OperatorList(34, "Zofia","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-zofia_317289.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/zofia_badge_306416.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtyfive = new OperatorList(35, "Dokkaebi","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-dokkaebi_317263.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6_operator_dokkaebi_badge_307134.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtysix = new OperatorList(36, "Vigil","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-vigil_317287.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege/r6-operator-vigil-badges_307135.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtyseven = new OperatorList(37, "Finka","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-finka_319120.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-finka.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtyeight = new OperatorList(38, "Lion","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-lion_319121.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-lion.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList thirtynine = new OperatorList(39, "Alibi","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-alibi_324447.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-alibi_324449.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList fourty = new OperatorList(40, "Maestro","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-maestro_324448.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-maestro_324450.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList fourtyone = new OperatorList(41, "Maverick","Atk", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-maverick_332583.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-maverick_332733.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M8.32%2C19.16l-5.54%2C5.54H2V28h3.31v-0.79l5.54-5.54H8.32V19.16z%20M25.2%2C2L10.29%2C17.18L8.5%2C15.4l-0.94%2C0.94%0D%0A%09%09%09l1.87%2C1.87v2.36h2.36l1.87%2C1.87l0.94-0.94l-1.78-1.78L28%2C4.8V2H25.2z%20M21.68%2C19.16v2.52h-2.52l5.54%2C5.54V28H28v-3.31h-0.78%0D%0A%09%09%09L21.68%2C19.16z%20M14.6%2C11.98L4.8%2C2H2v2.8l9.98%2C9.8L14.6%2C11.98z%20M20.57%2C18.21l1.87-1.87L21.5%2C15.4l-1.78%2C1.78l-1.67-1.71l-2.56%2C2.56%0D%0A%09%09%09l1.7%2C1.67L15.4%2C21.5l0.94%2C0.94l1.87-1.87h2.36V18.21z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//        OperatorList fourtytwo = new OperatorList(42, "Clash","Def", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-list-clash_332946.png", "https://ubistatic19-a.akamaihd.net/resource/en-us/game/rainbow6/siege-v3/r6-operators-badge-clash_332735.png", "data:image/svg+xml;charset=utf8,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2030%2030%22%3E%0D%0A%3Cpath%20fill%3D%22%23FFFFFF%22%20d%3D%22M19.27%2C9.74l-4.25%2C2.17L10.73%2C9.7L8.15%2C28h13.7L19.27%2C9.74z%20M21.23%2C7.01V2h-2.88v1.73h-1.96V2h-2.78v1.73%0D%0A%09%09%09h-1.96V2H8.77v4.96l6.25%2C3.51L21.23%2C7.01z%22%2F%3E%0D%0A%3C%2Fsvg%3E");
//
//
//        this.operatorListRepository.save(one);
//        this.operatorListRepository.save(two);
//        this.operatorListRepository.save(three);
//        this.operatorListRepository.save(four);
//        this.operatorListRepository.save(five);
//        this.operatorListRepository.save(six);
//        this.operatorListRepository.save(seven);
//        this.operatorListRepository.save(eight);
//        this.operatorListRepository.save(nine);
//        this.operatorListRepository.save(ten);
//        this.operatorListRepository.save(eleven);
//        this.operatorListRepository.save(twelve);
//        this.operatorListRepository.save(thirteen);
//        this.operatorListRepository.save(fourteen);
//        this.operatorListRepository.save(fifteen);
//        this.operatorListRepository.save(sixteen);
//        this.operatorListRepository.save(seventeen);
//        this.operatorListRepository.save(eightteen);
//        this.operatorListRepository.save(nineteen);
//        this.operatorListRepository.save(twenty);
//        this.operatorListRepository.save(twentyone);
//        this.operatorListRepository.save(twentytwo);
//        this.operatorListRepository.save(twentythree);
//        this.operatorListRepository.save(twentyfour);
//        this.operatorListRepository.save(twentyfive);
//        this.operatorListRepository.save(twentysix);
//        this.operatorListRepository.save(twentyseven);
//        this.operatorListRepository.save(twentyeight);
//        this.operatorListRepository.save(twentynine);
//        this.operatorListRepository.save(thirty);
//        this.operatorListRepository.save(thirtyone);
//        this.operatorListRepository.save(thirtytwo);
//        this.operatorListRepository.save(thirtythree);
//        this.operatorListRepository.save(thirtyfour);
//        this.operatorListRepository.save(thirtyfive);
//        this.operatorListRepository.save(thirtysix);
//        this.operatorListRepository.save(thirtyseven);
//        this.operatorListRepository.save(thirtyeight);
//        this.operatorListRepository.save(thirtynine);
//        this.operatorListRepository.save(fourty);
//        this.operatorListRepository.save(fourtyone);
//        this.operatorListRepository.save(fourtytwo);
//
//
//    }
//}