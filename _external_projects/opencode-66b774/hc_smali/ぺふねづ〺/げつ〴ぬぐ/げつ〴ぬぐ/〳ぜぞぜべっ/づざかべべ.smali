.class public abstract Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    return-void
.end method

.method public static くし〴〺ぅ(Landroid/app/Activity;)Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")",
            "L\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079<",
            "+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_c

    new-instance v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/びぐびあび;

    invoke-direct {v0, p0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/びぐびあび;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_c
    instance-of v0, p0, Landroidx/appcompat/app/AppCompatActivity;

    if-eqz v0, :cond_18

    new-instance v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/〺つふすそ;

    check-cast p0, Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {v0, p0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/〺つふすそ;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    return-object v0

    :cond_18
    new-instance v0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method


# virtual methods
.method public abstract 〺つふすそ()Landroid/content/Context;
.end method

.method public varargs abstract げつ〴ぬぐ(I[Ljava/lang/String;)V
.end method

.method public varargs abstract づざかべべ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)V
.end method

.method public abstract びぐびあび(Ljava/lang/String;)Z
.end method
