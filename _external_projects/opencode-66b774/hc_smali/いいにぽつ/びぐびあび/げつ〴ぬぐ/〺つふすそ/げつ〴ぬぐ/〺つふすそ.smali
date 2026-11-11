.class public Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ;


# static fields
.field public static final くし〴〺ぅ:Ljava/util/List;


# instance fields
.field public 〺つふすそ:[B

.field public げつ〴ぬぐ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .registers 3

    sget-object p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    iput-object p2, p0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:[B

    return-void
.end method
