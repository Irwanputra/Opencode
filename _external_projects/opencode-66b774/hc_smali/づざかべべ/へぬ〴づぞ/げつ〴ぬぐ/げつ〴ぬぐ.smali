.class public abstract Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3041\u3054\u3050\u3059\u3059\u3043;",
            ":",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3054\u3065\u3054\u304d\u3048;",
            ">(TT;)",
            "L\u3065\u3056\u304b\u3079\u3079/\u3078\u306c\u3034\u3065\u305e/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050;"
        }
    .end annotation

    new-instance v0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;

    move-object v1, p0

    check-cast v1, Lづざかべべ/のぷのちつ/ごづごきえ;

    invoke-interface {v1}, Lづざかべべ/のぷのちつ/ごづごきえ;->は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/は〲ぱなで;)V

    return-object v0
.end method


# virtual methods
.method public abstract げつ〴ぬぐ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
