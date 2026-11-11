.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "L\u3066\u305c\u304d\u307d\u304f/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u306e\u3077\u306e\u3061\u3064/\u3052\u3064\u3034\u306c\u3050;",
        ">;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public ぁごぐすすぃ:Ljava/io/File;

.field public くし〴〺ぅ:Ljava/lang/String;

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iput-object p4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    iput-object p5, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    iput-object p6, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .registers 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseValueOf"
        }
    .end annotation

    check-cast p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    .line 1
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/io/File;

    if-eqz v0, :cond_21

    new-instance v0, Ljava/lang/Long;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    new-instance v1, Ljava/lang/Long;

    .line 2
    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/io/File;

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1

    :cond_21
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
