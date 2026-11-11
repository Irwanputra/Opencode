.class public Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

.field public static final びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;


# instance fields
.field public final 〺つふすそ:Z

.field public final げつ〴ぬぐ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;-><init>(ZZ)V

    sput-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;-><init>(ZZ)V

    sput-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    return-void
.end method

.method public constructor <init>(ZZ)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Z

    iput-boolean p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iget-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Z

    if-nez v0, :cond_c

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_c
    return-object p1
.end method
